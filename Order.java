/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String status;
    private List<OrderDetail> orderDetails;

    public Order(int id) {
        this.id = id;
        this.status = "no procesado";
        this.orderDetails = new ArrayList<>();
    }

    public double calcSubTotalOrder() {
        double total = 0.0;
        for (OrderDetail detail : orderDetails) {
            total += detail.calcSubTotal();
        }
        return total;
    }

    public double calcTax() {
        double totalTax = 0.0;
        for (OrderDetail detail : orderDetails) {
            if (detail.getTaxStatus().equals("aprobado")) {
                totalTax += detail.calcSubTotal() * detail.IGV;
            }
        }
        return totalTax;
    }

    public double calcTotal() {
        return calcSubTotalOrder() + calcTax();
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    // Método main para la clase Order
    public static void main(String[] args) {
        // Crear una instancia de Order
        Order order = new Order(1);

        // Crear y agregar detalles de la orden
        OrderDetail detail1 = new OrderDetail("aprobado", 1);
        detail1.addProduct(new Product("Producto 1", 10.0, 0.5, 2));
        order.addOrderDetail(detail1);

        OrderDetail detail2 = new OrderDetail("no aprobado", 2);
        detail2.addProduct(new Product("Producto 2", 20.0, 0.8, 1));
        order.addOrderDetail(detail2);

        // Calcular y mostrar los resultados
        System.out.println("Subtotal de la orden: $" + order.calcSubTotalOrder());
        System.out.println("Impuestos de la orden: $" + order.calcTax());
        System.out.println("Total de la orden: $" + order.calcTotal());
    }
}
