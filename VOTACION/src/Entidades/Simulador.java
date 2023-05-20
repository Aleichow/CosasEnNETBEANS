/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.ComparadorAlumnoPorVotosRecibidos;
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

    public void mostrarConVotos(List<Alumno> listaAlumno) {

        for (Alumno alumno1 : listaAlumno) {
            System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido());
            System.out.println("Cantidad de votos: " + alumno1.getCantVotos());
            System.out.println("Votos Recibidos: ");
            alumno1.mostarVotoRecibido();
        }

    }

    public static void recuentoVotos(List<Alumno> listaAlumno) {
        int max = 0;
        Alumno masVotado = new Alumno();
        for (Alumno alumno1 : listaAlumno) {
            System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido());
            System.out.println("Recibio: " + alumno1.getVotosRecibidos().size());

            if (max < alumno1.getVotosRecibidos().size()) {
                max = alumno1.getVotosRecibidos().size();
                masVotado = alumno1;
            }

        }
        System.out.println("El ganador de las elecciones es: " + masVotado + " con: " + max + " votos.");
    }

    public void crearFacilitadores(List<Alumno> listaAlumno) {

        Collections.sort(listaAlumno, new ComparadorAlumnoPorVotosRecibidos());

        for (Alumno alumno1 : listaAlumno) {
            System.out.println(alumno1.getNombre() + " " + alumno1.getApellido() + " " + alumno1.getVotosRecibidos().size());
        }

        for (int i = 0; i < listaAlumno.size(); i++) {

            if (i < 5) {
                System.out.println(listaAlumno.get(i) + " Es un primer facilitador");
            } else {

                System.out.println(listaAlumno.get(i) + " Es un facilitador suplente");
            }

        }

    }

}
