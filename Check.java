/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author ameli
 */
public class Check extends Payment {
    private String name;
    private String bankID;
    private boolean authorized;

    public Check(String name, String bankID, boolean authorized) {
        this.name = name;
        this.bankID = bankID;
        this.authorized = authorized;
    }

    @Override
    public double calculateTotalAmount() {
        System.out.println("Estoy pagando con cheque");
        return amount; // Se asume que el monto está predefinido en la clase abstracta
    }

    @Override
    public String toString() {
        return "Check: Name = " + name + ", Bank ID = " + bankID + ", Authorized = " + authorized;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
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
