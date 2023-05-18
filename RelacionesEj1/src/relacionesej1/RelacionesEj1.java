/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;

import Entidades.Perro;
import Entidades.Persona;
import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class RelacionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona> personas = new ArrayList<>();
        List<Perro> perrosDisponibles = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas:");
        int cantidadPersonas = sc.nextInt();
        sc.nextLine(); // Limpiar el salto de línea

        for (int i = 1; i <= cantidadPersonas; i++) {
            System.out.println("Ingrese los datos de la persona " + i + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Documento: ");
            int documento = sc.nextInt();
            sc.nextLine(); // Limpiar el salto de línea

            Persona persona = new Persona(nombre, apellido, edad, documento);
            personas.add(persona);
        }

        System.out.println("Ingrese la cantidad de perros disponibles:");
        int cantidadPerros = sc.nextInt();
        sc.nextLine(); // Limpiar el salto de línea

        for (int i = 1; i <= cantidadPerros; i++) {
            System.out.println("Ingrese los datos del perro " + i + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Raza: ");
            String raza = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Tamaño: ");
            double tamaño = sc.nextDouble();
            sc.nextLine(); // Limpiar el salto de línea

            Perro perro = new Perro(nombre, raza, edad, tamaño);
            perrosDisponibles.add(perro);
        }

        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getNombre() + " " + persona.getApellido());
            System.out.println("Perros disponibles:");
            perrosDisponibles.forEach((perro) -> {
                System.out.println(perro.getNombre());
            });
            System.out.print("Elija el nombre del perro que desea adoptar: ");
            String nombrePerroElegido = sc.nextLine();

            Perro perroElegido = null;
            for (Perro perro : perrosDisponibles) {
                if (perro.getNombre().equalsIgnoreCase(nombrePerroElegido)) {
                    perroElegido = perro;
                    break;
                }
            }

            if (perroElegido != null) {
                persona.adoptarPerro(perroElegido);
                perrosDisponibles.remove(perroElegido);
                System.out.println("Perro adoptado con éxito.");
            } else {
                System.out.println("El perro elegido no está disponible.");
            }
        }

        System.out.println("Información de las personas con sus respectivos perros adoptados:");
        personas.stream().map((persona) -> {
            persona.mostrarInfo();
            return persona;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });
    }
}
