/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class serviceAlumnos {

    Scanner sc = new Scanner(System.in);

    public Alumnos crearAlum() {
        ArrayList<Integer> notas = new ArrayList<>();

        System.out.println("Cual es el nombre de este Alumno: ");
        String nombre = sc.nextLine();

        System.out.println("Decime las tres notas de: " + nombre);
        for (int i = 0; i < 3; i++) {
            notas.add(sc.nextInt());
        }
        sc.nextLine();
        Alumnos alum = new Alumnos(nombre, notas);

        return alum;

    }

    public double notaFinal(ArrayList<Alumnos> a1) {
        double notaF;
        int sum = 0;

        System.out.println(a1);
        System.out.println("Dame el nombre del alumno que queres encontrar: ");
        sc.nextLine();
        String alumBus = sc.nextLine();

        Iterator it = a1.iterator();

        while (it.hasNext()) {
            Alumnos alumno = (Alumnos) it.next();
            if (alumno.getNombre().equalsIgnoreCase(alumBus)) {
                ArrayList<Integer> notas = alumno.getNotas();
                int sumaNotas = 0;
                for (Integer nota : notas) {
                    sumaNotas += nota;
                }
                notaF = (double) sumaNotas / notas.size();
                System.out.println("La nota final de " + alumBus + " es: " + notaF);
                return notaF;
            }
        }

        System.out.println("No se encontró un alumno con ese nombre.");
        notaF = 0;
        return notaF;
    }

}
