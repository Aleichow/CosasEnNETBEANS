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
public class Poliza {

    public Clientes cliente;
    public Vehiculos vehiculo;

    public int nropoliza, cantcuotas, montototal, montomaxgranizo;
    public Date fechainicio, fechafin;
    public String formapago, tipocobertura;

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNropoliza() {
        return nropoliza;
    }

    public void setNropoliza(int nropoliza) {
        this.nropoliza = nropoliza;
    }

    public int getCantcuotas() {
        return cantcuotas;
    }

    public void setCantcuotas(int cantcuotas) {
        this.cantcuotas = cantcuotas;
    }

    public int getMontototal() {
        return montototal;
    }

    public void setMontototal(int montototal) {
        this.montototal = montototal;
    }

    public int getMontomaxgranizo() {
        return montomaxgranizo;
    }

    public void setMontomaxgranizo(int montomaxgranizo) {
        this.montomaxgranizo = montomaxgranizo;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public String getTipocobertura() {
        return tipocobertura;
    }

    public void setTipocobertura(String tipocobertura) {
        this.tipocobertura = tipocobertura;
    }

    public boolean isIncluyegranizo() {
        return incluyegranizo;
    }

    public void setIncluyegranizo(boolean incluyegranizo) {
        this.incluyegranizo = incluyegranizo;
    }

    public Poliza() {
    }

    public Poliza(Clientes cliente, Vehiculos vehiculo, int nropoliza, int cantcuotas, int montototal, int montomaxgranizo, Date fechainicio, Date fechafin, String formapago, String tipocobertura, boolean incluyegranizo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.nropoliza = nropoliza;
        this.cantcuotas = cantcuotas;
        this.montototal = montototal;
        this.montomaxgranizo = montomaxgranizo;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.formapago = formapago;
        this.tipocobertura = tipocobertura;
        this.incluyegranizo = incluyegranizo;
    }
    public boolean incluyegranizo;

}
