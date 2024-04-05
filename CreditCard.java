/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

import java.util.Date;

/**
 *
 * @author ameli
 */
public class CreditCard extends Payment {
    private String name;
    private String type;
    private Date expDate;
    private boolean authorized;

    public CreditCard(String name, String type, Date expDate, boolean authorized) {
        this.name = name;
        this.type = type;
        this.expDate = expDate;
        this.authorized = authorized;
    }

    @Override
    public double calculateTotalAmount() {
        System.out.println("Estoy pagando con tarjeta de crédito");
        return amount; // Se asume que el monto está predefinido en la clase abstracta
    }

    @Override
    public String toString() {
        return "Credit Card: Name = " + name + ", Type = " + type + ", Expiry Date = " + expDate + ", Authorized = " + authorized;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}