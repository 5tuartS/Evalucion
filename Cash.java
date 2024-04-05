/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden;
/**
 *
 * @author ameli
 */
public class Efectivo extends Pago {
    private double montoEfectivo; // Monto en efectivo
    private double deduccion; // Deducción aplicada al monto

    //Constructor de la clase Efectivo.

    public Efectivo(double montoEfectivo, double deduccion) {
        this.montoEfectivo = montoEfectivo;
        this.deduccion = deduccion;
    }

    // Calcula el monto total, restando la deducción del monto en efectivo.

    @Override
    public double calcularMontoTotal() {
        System.out.println("Estoy pagando en efectivo");
        return montoEfectivo - deduccion;
    }

    //Devuelve una representación en cadena del pago en efectivo.
    @Override
    public String toString() {
        return "Efectivo: Monto = " + montoEfectivo + ", Deducción = " + deduccion;
    }

    // Getters y setters

    public double getMontoEfectivo() {
        return montoEfectivo;
    }

    public void setMontoEfectivo(double montoEfectivo) {
        this.montoEfectivo = montoEfectivo;
    }

    public double getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
