/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej1;

import Entidades.Persona;
import Entidades.Persona2;

/**
 *
 * @author user
 */
public class ExcepcionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona persona1 = null; // Inicializar el objeto como null
        Persona persona2 = new Persona("aa", 19, "Hombre", 90, 1.70);
        int[] numeros = {1, 2, 3};
        Persona2 p1 = new Persona2("Jose", numeros);

        p1.imprimirNumero(1);
        p1.imprimirNumero(5);

        Persona[] personas = {persona1, persona2}; // Array que contiene ambos objetos

        for (Persona persona : personas) {
            try {
                boolean esMayor = persona.mayor(persona);
                System.out.println("Es mayor de edad: " + esMayor);
            } catch (NullPointerException e) {
                System.out.println(e.fillInStackTrace());
                System.out.println("Error: " + e.getMessage());
                System.out.println("Error: " + e);

            }
        }
    }
}
