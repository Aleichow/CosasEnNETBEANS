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
public class PersonalServicio extends Persona {

    private int añoIncorporacion;

    private String seccion, numeroDespacho;

    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int añoIncorporacion, String numeroDespacho, String seccion) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeroDespacho = numeroDespacho;
        this.seccion = seccion;
    }

    // Getters y setters
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    // Métodos adicionales
    public void cambiarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección: " + seccion);
        System.out.println("Año de entrada: " + añoIncorporacion);
        System.out.println("Despacho: " + numeroDespacho);
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

    public void cambiarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

}
