/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author user
 */
public class Simulador {

    Scanner leer = new Scanner(System.in);
    public ArrayList<String> nombre;
    public ArrayList<String> apellido;
    public Alumno alumno;

    public Simulador() {
        nombre = new ArrayList<>();
        nombre.add("Alejo");
        nombre.add("Eylin");
        nombre.add("Agustin");
        nombre.add("Sebastian");
        nombre.add("Eduardo");

        apellido = new ArrayList<>();
        apellido.add("Gárderes");
        apellido.add("Rocchi");
        apellido.add("Macharette");
        apellido.add("Bertero");
        apellido.add("Rodriguez");

    }

    public List<Integer> combinacionDni() {
        List<Integer> ListaDNI = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int dni = random.nextInt(99999999 - 11111111 + 1) + 11111111;

            ListaDNI.add(dni);

        }

        System.out.println(ListaDNI);
        return ListaDNI;
    }

    public List<Alumno> crearAlumnos(List<Integer> listaDni) {
        List<Alumno> listaAlumnos = new ArrayList<>();

        Set<Integer> dnisUtilizados = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            String n1 = this.nombre.get((int) (Math.random() * this.nombre.size()));
            String a1 = this.apellido.get((int) (Math.random() * this.apellido.size()));
            int dni = generarDNIUnico(dnisUtilizados, listaDni);

            Alumno alumno1 = new Alumno(n1, a1, dni);

            listaAlumnos.add(alumno1);

        }

        return listaAlumnos;
    }

    private int generarDNIUnico(Set<Integer> dnisUtilizados, List<Integer> listaDni) {
        Random random = new Random();
        int dni = listaDni.get(random.nextInt(listaDni.size()));

        while (dnisUtilizados.contains(dni)) {
            dni = listaDni.get(random.nextInt(listaDni.size()));
        }
        dnisUtilizados.add(dni);

        return dni;

    }

    public void imprimirAlumnos(List<Alumno> listaAlumnos) {

        System.out.println("Estos son los alumnos:");

        listaAlumnos.forEach((listaAlumno) -> {
            System.out.println("Nombre Completo: " + listaAlumno.getNombre() + " " + listaAlumno.getApellido() + " DNI: " + listaAlumno.getDni());
        });
    }

    public void votacion(List<Alumno> listaAlumnos) {
        listaAlumnos.forEach((alumnoVotante) -> {
            Set<Alumno> votosRealizados = new HashSet<>(); // Conjunto para evitar votos duplicados

            for (int i = 0; i < 3; i++) {
                // Obtener un alumno al azar para votar
                Alumno alumnoVotado = listaAlumnos.get((int) (Math.random() * listaAlumnos.size()));

                // Verificar que el alumno no se haya votado a sí mismo o que no haya votado previamente al mismo alumno
                while (alumnoVotado == alumnoVotante || votosRealizados.contains(alumnoVotado)) {
                    alumnoVotado = listaAlumnos.get((int) (Math.random() * listaAlumnos.size()));
                }

               
               

                // Registrar el voto recibido por el alumno votado
                alumnoVotado.guardarVotoRecibido(alumnoVotante);

                // Agregar el alumno votado al conjunto de votos realizados para evitar duplicados
                votosRealizados.add(alumnoVotado);
                 
                alumnoVotante.votar(votosRealizados);
                
            }
        });

        System.out.println("Ya voto!");
    }

    public void mostrarResultados(List<Alumno> alumnos) {
        alumnos.stream().map((alumno1) -> {
            System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido());
            return alumno1;
        }).map((alumno1) -> {
            System.out.println("Cantidad de votos: " + alumno1.getCantVotos());
            return alumno1;
        }).map((alumno1) -> {
            System.out.println("Votos Recibidos: ");
            return alumno1;
        }).map((alumno1) -> {
            alumno1.mostarVotoRecibido();
            return alumno1;
        }).forEachOrdered((_item) -> {
            System.out.println("-----------------------");
        });
    }

    public static void recuentoVotos(List<Alumno> listaAlumnos) {
        Map<Alumno, Integer> contadorVotos = new HashMap<>();

        // Inicializar contador de votos para cada alumno
        listaAlumnos.forEach((alumno) -> {
            contadorVotos.put(alumno, 0);
        });

        // Contar votos recibidos por cada alumno
        listaAlumnos.stream().map((alumno) -> (List<Alumno>) alumno.getVotosRecibidos()).forEachOrdered((votosRecibidos) -> {
            votosRecibidos.forEach((votante) -> {
                contadorVotos.put(votante, contadorVotos.get(votante) + 1);
            });
        });

        // Mostrar los resultados del recuento de votos
        listaAlumnos.stream().map((alumno) -> {
            int cantidadVotos = contadorVotos.get(alumno);
            System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
            System.out.println("Cantidad de votos recibidos: " + cantidadVotos);
            return alumno;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });
    }

    public void crearFacilitadores() {

    }

}
