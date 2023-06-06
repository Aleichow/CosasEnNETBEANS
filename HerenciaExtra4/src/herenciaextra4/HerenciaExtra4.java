/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra4;

import Entidades.Estudiante;
import Entidades.PersonalServicio;
import Entidades.Profesor;

/**
 *
 * @author user
 */
public class HerenciaExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "12345678", "Soltero", "Informática");

        Profesor profesor = new Profesor("AA", "BB", "987654321", "Soltero", 2004, "Despacho 4", "Lenguas");

        PersonalServicio personalServicio = new PersonalServicio("CC", "DD", "95748625", "Casado", 1998, "Despacho 7", "Baños");

        // Imprimir información inicial
        System.out.println("Información inicial:");
        estudiante.imprimirInformacion();
        System.out.println();
        profesor.imprimirInformacion();
        System.out.println();
        personalServicio.imprimirInformacion();
        System.out.println();

        // Realizar cambios
        estudiante.cambiarEstadoCivil("Casado");
        profesor.cambiarDepartamento("Matemáticas");
        personalServicio.cambiarSeccion("Decanato");
        profesor.cambiarDespacho("Despacho 2");
        personalServicio.cambiarDespacho("Despacho 4");

        // Imprimir información actualizada
        System.out.println("Información después de cambios:");
        estudiante.imprimirInformacion();
        System.out.println();
        profesor.imprimirInformacion();
        System.out.println();
        personalServicio.imprimirInformacion();
    }

}
