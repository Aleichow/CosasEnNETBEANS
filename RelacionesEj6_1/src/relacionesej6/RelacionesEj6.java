/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej6;

import Entidades.Alumno;
import Entidades.Simulador;
import java.util.List;

/**
 *
 * @author user
 */
public class RelacionesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Simulador simulador = new Simulador();

        // Generar lista de DNI
        List<Integer> listaDni = simulador.combinacionDni();

        // Crear lista de alumnos
        List<Alumno> listaAlumnos = simulador.crearAlumnos(listaDni);

        // Imprimir lista de alumnos
        simulador.imprimirAlumnos(listaAlumnos);

        // Realizar votaciones
        simulador.votacion(listaAlumnos);

        // Mostrar resultados de votaciones
        simulador.mostrarResultados(listaAlumnos);

        // Realizar recuento de votos
        Simulador.recuentoVotos(listaAlumnos);

        // Crear facilitadores y facilitadores suplentes
        Simulador.crearFacilitadores(listaAlumnos);

    }
}
