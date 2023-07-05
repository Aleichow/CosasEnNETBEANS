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
public class Clientes {
    private int idCliente;
    private String nombre;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private String email;
    
    // Constructor sin argumentos
    public Clientes() {
    }
    
    // Constructor con todos los argumentos
    public Clientes(int idCliente, String nombre, String calle, int numero, String codigoPostal, String ciudad, String pais, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }
    
    // Getter y Setter para idCliente
    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return "idCliente=" + idCliente + ", nombre=" + nombre + ", calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", pais=" + pais + ", email=" + email + '}';
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    // Getter y Setter para email
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

}
