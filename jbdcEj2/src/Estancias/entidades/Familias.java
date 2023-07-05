/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.entidades;

/**
 *
 * @author user
 */
public class Familias {
    private int idFamilia;
    private String nombre;
    private int edadMinima;
    private int edadMaxima;
    private int numHijos;
    private String email;
    private int idCasaFamilia;
    
    // Constructor sin argumentos
    public Familias() {
    }
    
    // Constructor con todos los argumentos
    public Familias(int idFamilia, String nombre, int edadMinima, int edadMaxima, int numHijos, String email, int idCasaFamilia) {
        this.idFamilia = idFamilia;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numHijos = numHijos;
        this.email = email;
        this.idCasaFamilia = idCasaFamilia;
    }
    
    // Getter y Setter para idFamilia
    public int getIdFamilia() {
        return idFamilia;
    }
    
    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }
    
    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter y Setter para edadMinima
    public int getEdadMinima() {
        return edadMinima;
    }
    
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    
    // Getter y Setter para edadMaxima
    public int getEdadMaxima() {
        return edadMaxima;
    }
    
    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }
    
    // Getter y Setter para numHijos
    public int getNumHijos() {
        return numHijos;
    }
    
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    
    // Getter y Setter para email
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Getter y Setter para idCasaFamilia
    public int getIdCasaFamilia() {
        return idCasaFamilia;
    }
    
    public void setIdCasaFamilia(int idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }

    @Override
    public String toString() {
        return "Familias{" +
                "idFamilia=" + idFamilia +
                ", nombre='" + nombre + '\'' +
                ", edadMinima=" + edadMinima +
                ", edadMaxima=" + edadMaxima +
                ", numHijos=" + numHijos +
                ", email='" + email + '\'' +
                ", idCasaFamilia=" + idCasaFamilia +
                '}';
    }
}