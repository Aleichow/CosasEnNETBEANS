/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() throws ParseException {

        System.out.println("¿Cual es el nombre de la persona?");
        String nombre = leer.nextLine();

        System.out.println("¿Cual es la fecha de nacimiento de la persona?(dd/MM/yyyy)");

        String sfechanaci = leer.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date fechanaci = formato.parse(sfechanaci);

        return new Persona(nombre, fechanaci);
    }

    public int calcularEdad(Persona persona) {

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(persona.getFechanaci());
        Calendar fechaActual = Calendar.getInstance();

        int diffAnios = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        int diffMeses = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
        int diffDias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        if (diffMeses < 0 || (diffMeses == 0 && diffDias < 0)) {
            diffAnios--;
        }

        return diffAnios;
    }

    public boolean menorQue(Persona persona, int edad) {

        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(Persona persona) {

        System.out.println("La persona se llama: " + persona.getNombre());
        System.out.println("Nacio el: " + persona.getFechanaci());
        System.out.println("Tiene: " + calcularEdad(persona) + " años.");

    }

}
