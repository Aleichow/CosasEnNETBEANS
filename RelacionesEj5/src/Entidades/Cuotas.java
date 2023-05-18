/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.Date;


/**
 *
 * @author user
 */
public class Cuotas {
    public Poliza poliza;
    public int nrocuota, montototal;
    public boolean pago;
    public Date vencimiento;
    public String formapago;

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public int getNrocuota() {
        return nrocuota;
    }

    public void setNrocuota(int nrocuota) {
        this.nrocuota = nrocuota;
    }

    public int getMontototal() {
        return montototal;
    }

    public void setMontototal(int montototal) {
        this.montototal = montototal;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public Cuotas() {
    }

    public Cuotas(Poliza poliza, int nrocuota, int montototal, boolean pago, Date vencimiento, String formapago) {
        this.poliza = poliza;
        this.nrocuota = nrocuota;
        this.montototal = montototal;
        this.pago = pago;
        this.vencimiento = vencimiento;
        this.formapago = formapago;
    }
}
