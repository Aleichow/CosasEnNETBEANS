/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author user
 */
public class Animales {

    protected String alimento, nombre, raza;
    protected int edad;

    public Animales(String alimento, String nombre, String raza, int edad) {
        this.alimento = alimento;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public void alimentarse() {

    }

}
