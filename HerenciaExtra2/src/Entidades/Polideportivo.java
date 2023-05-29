/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Polideportivo extends Edificio {

    Scanner sc = new Scanner(System.in);
    private String nombre, tipoInstalacion;

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo ;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }
}
