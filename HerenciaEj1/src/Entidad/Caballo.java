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
public class Caballo extends Animales {

    public Caballo(String alimento, String nombre, String raza, int edad) {
        super(alimento, nombre, raza, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println(this.nombre + " Se alimenta de: " + this.alimento);
    }
}
