/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author ameli
 */
public class Cash extends Payment {
    private double cashAmount;
    private double deduction;

    public Cash(double cashAmount, double deduction) {
        this.cashAmount = cashAmount;
        this.deduction = deduction;
    }

    @Override
    public double calculateTotalAmount() {
        System.out.println("Estoy pagando con efectivo");
        return cashAmount - deduction;
    }

    @Override
    public String toString() {
        return "Cash: Amount = " + cashAmount + ", Deduction = " + deduction;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
