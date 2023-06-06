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
public class Persona2 {

    private String nombre;
    private int[] numeros; // Campo de tipo array

    public Persona2(String nombre, int[] numeros) {
        this.nombre = nombre;
        this.numeros = numeros;
    }

    public void imprimirNumero(int indice) {
        try {
            int numero = numeros[indice];
            System.out.println("Número: " + numero);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e);
            System.out.println(e.fillInStackTrace());
        }
    }
}
