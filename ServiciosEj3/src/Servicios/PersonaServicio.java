/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("¿Como se llama la persona?");
        String nombre = leer.nextLine();
        System.out.println("¿Cuantos años tiene?");
        int edad = leer.nextInt();

        String sexo;
        do {
            System.out.print("Ingrese el sexo (H/M/O): ");
            sexo = leer.nextLine().toUpperCase();
            if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
                System.out.println("Sexo inválido. Ingrese H, M o O.");
            }
        } while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));

        System.out.println("¿Cuanto pesa?");
        double peso = leer.nextDouble();
        System.out.println("¿Cuanto mide en CM?");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean mayor(Persona Persona) {
        return Persona.getEdad() >= 18;
    }

    public int calcularIMC(Persona Persona) {

        Double IMC = (Persona.getPeso() / ((Persona.getAltura() / 100) * (Persona.getAltura() / 100)));

        if (IMC < 20) {

            return -1; // Por debajo del peso ideal
        } else if (IMC >= 20 && IMC <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }

    }

}
