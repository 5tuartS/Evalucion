/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String DNI;
    private String name;
    private String surname;
    private String address;
    private int age;
    private List<Order> orders;

    // Constructor sin parámetros
    public Customer() {
        this.orders = new ArrayList<>();
    }

    // Constructor con parámetros
    public Customer(String DNI, String name, String surname) {
        this.DNI = DNI;
        this.name = name;
        this.surname = surname;
        this.orders = new ArrayList<>();
    }

    // Método para obtener una orden por su id
    public Order getOrder(int idOrder) {
        for (Order order : orders) {
            if (order.getId() == idOrder) {
                return order;
            }
        }
        return null; // Devuelve null si no se encuentra la orden
    }

    // Método toString para mostrar toda la información del cliente
    @Override
    public String toString() {
        return "Customer{" +
                "DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", orders=" + orders +
                '}';
    }

    // Getters y setters
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

