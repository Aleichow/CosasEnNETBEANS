/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadService;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class personaService {

    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Dame el nombre de la persona");

        String nombre = leer.nextLine();

        System.out.println("Dame el apodo de la persona");

        String apodo = leer.nextLine();
        System.out.println("Dame la edad de la persona");

        int edad = leer.nextInt();

        System.out.println("Dame la altura de la persona");

        double altura = leer.nextDouble();

        return new Persona(nombre, apodo, edad, altura);

    }

}
