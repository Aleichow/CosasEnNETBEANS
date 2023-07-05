/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.entidades;

import java.sql.Date;

/**
 *
 * @author user
 */
public class Casas {
       private int idCasa;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private int tiempoMinimo;
    private int tiempoMaximo;
    private double precioHabitacion;
    private String tipoVivienda;
    
    // Constructor sin argumentos
    public Casas() {
    }
    
    // Constructor con todos los argumentos
    public Casas(int idCasa, String calle, int numero, String codigoPostal, String ciudad, String pais, Date fechaDesde, Date fechaHasta, int tiempoMinimo, int tiempoMaximo, double precioHabitacion, String tipoVivienda) {
        this.idCasa = idCasa;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.tiempoMinimo = tiempoMinimo;
        this.tiempoMaximo = tiempoMaximo;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }
    
    // Getter y Setter para idCasa
    public int getIdCasa() {
        return idCasa;
    }
    
    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    
    // Getter y Setter para calle
    public String getCalle() {
        return calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    // Getter y Setter para numero
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // Getter y Setter para codigoPostal
    public String getCodigoPostal() {
        return codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    // Getter y Setter para ciudad
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    // Getter y Setter para pais
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    // Getter y Setter para fechaDesde
    public Date getFechaDesde() {
        return fechaDesde;
    }
    
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    
    // Getter y Setter para fechaHasta
    @Override
    public String toString() {
        return "idCasa=" + idCasa + ", calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", pais=" + pais + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", tiempoMinimo=" + tiempoMinimo + ", tiempoMaximo=" + tiempoMaximo + ", precioHabitacion=" + precioHabitacion + ", tipoVivienda=" + tipoVivienda + '}';
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }
    
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
    // Getter y Setter para tiempoMinimo
    public int getTiempoMinimo() {
        return tiempoMinimo;
    }
    
    public void setTiempoMinimo(int tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }
    
    // Getter y Setter para tiempoMaximo
    public int getTiempoMaximo() {
        return tiempoMaximo;
    }
    
    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }
    
    // Getter y Setter para precioHabitacion
    public double getPrecioHabitacion() {
        return precioHabitacion;
    }
    
    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    
    // Getter y Setter para tipoVivienda
    public String getTipoVivienda() {
        return tipoVivienda;
    }
    
    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }
}
