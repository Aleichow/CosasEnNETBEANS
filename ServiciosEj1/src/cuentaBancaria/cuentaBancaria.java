/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaBancaria;

/**
 *
 * @author user
 */
public class cuentaBancaria {

    private int nrocuenta;
    private double saldocuenta;
    private long dnicliente;

    public cuentaBancaria() {
    }

    public cuentaBancaria(int nrocuenta, double saldocuenta, long dnicliente) {
        this.nrocuenta = nrocuenta;
        this.saldocuenta = saldocuenta;
        this.dnicliente = dnicliente;
    }

    public int getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(int nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public double getSaldocuenta() {
        return saldocuenta;
    }

    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    public long getDnicliente() {
        return dnicliente;
    }

    public void setDnicliente(long dnicliente) {
        this.dnicliente = dnicliente;
    }

    @Override
    public String toString() {
        return "cuentaBancaria{" + "nrocuenta=" + nrocuenta + ", saldocuenta=" + saldocuenta + ", dnicliente=" + dnicliente + '}';
    }

}
