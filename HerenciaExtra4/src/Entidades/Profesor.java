/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author user
 */
public class Profesor extends Persona {

    private int añoIncorporacion;
    private String departamento, numeroDespacho;



    public Profesor(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int añoIncorporacion, String numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeroDespacho = numeroDespacho;
        this.departamento = departamento;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(int añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }

    public String getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(String numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    // Getters y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Métodos adicionales
    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    public void cambiarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Departamento: " + departamento);
        System.out.println("Año de entrada: " + añoIncorporacion);
        System.out.println("Despacho: " + numeroDespacho);
        
    }
}
