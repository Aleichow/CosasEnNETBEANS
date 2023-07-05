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
public class Estancias {
     private int idEstancia;
    private int idCliente;
    private int idCasa;
    private String nombreHuesped;
    private Date fechaDesde;
    private Date fechaHasta;
    
    // Constructor sin argumentos
    public Estancias() {
    }
    
    // Constructor con todos los argumentos
    public Estancias(int idEstancia, int idCliente, int idCasa, String nombreHuesped, Date fechaDesde, Date fechaHasta) {
        this.idEstancia = idEstancia;
        this.idCliente = idCliente;
        this.idCasa = idCasa;
        this.nombreHuesped = nombreHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }
    
    // Getter y Setter para idEstancia
    public int getIdEstancia() {
        return idEstancia;
    }
    
    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }
    
    // Getter y Setter para idCliente
    public int getIdCliente() {
        return idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    // Getter y Setter para idCasa
    public int getIdCasa() {
        return idCasa;
    }
    
    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    
    // Getter y Setter para nombreHuesped
    public String getNombreHuesped() {
        return nombreHuesped;
    }
    
    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }
    
    // Getter y Setter para fechaDesde
    public Date getFechaDesde() {
        return fechaDesde;
    }
    
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    
    // Getter y Setter para fechaHasta
    public Date getFechaHasta() {
        return fechaHasta;
    }
    
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public String toString() {
        return "idEstancia=" + idEstancia + ", idCliente=" + idCliente + ", idCasa=" + idCasa + ", nombreHuesped=" + nombreHuesped + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + '}';
    }



}
