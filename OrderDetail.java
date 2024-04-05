/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author ameli
 */
import java.util.ArrayList;
import java.util.List;

class OrderDetail {
    private int id;
    private String taxStatus;
    private List<Product> products;
    final double IGV = 0.18;

    public OrderDetail(String taxStatus, int id) {
        this.taxStatus = taxStatus;
        this.id = id;
        this.products = new ArrayList<>();
    }

    public double calcSubTotal() {
        double subtotal = 0.0;
        for (Product product : products) {
            subtotal += product.getPrice() * product.getQuantity();
        }
        return subtotal;
    }

    public double calcWeight() {
        double totalWeight = 0.0;
        for (Product product : products) {
            totalWeight += product.getWeight() * product.getQuantity();
        }
        return totalWeight;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}



