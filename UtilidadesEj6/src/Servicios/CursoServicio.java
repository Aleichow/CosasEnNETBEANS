/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Curso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in);

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Dame el nombre del alumno " + (i + 1));
            alumnos[i] = leer.nextLine();
        }
        return alumnos;
    }

    public Curso crearCurso() {

        System.out.println("Como se llama el curso: ");
        String nombreCurso = leer.nextLine();

        System.out.println("Ingrese el turno");
        String turno = leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por dia");
        int cantHorasxDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana");
        int cantDiasxSemana = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el precio x hora");
        double precioxhora = leer.nextDouble();
        leer.nextLine();
        String[] alumnos = cargarAlumnos();

        return new Curso(nombreCurso, turno, cantHorasxDia, cantDiasxSemana, precioxhora, alumnos);
    }

    public void calcularGanancias(Curso curso) {
        Double ganancias = ((curso.cantHorasxDia * curso.getPrecioxhora() * curso.getAlumnos().length)) * curso.getCantDiasxSemana();
        System.out.println("La ganancia en una semana del curso " + curso.getNombreCurso() + " es: " + ganancias);

    }

}
