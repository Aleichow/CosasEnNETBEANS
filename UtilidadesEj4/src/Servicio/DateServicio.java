/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DateServicio {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {

        System.out.println("Dame el año en el que naciste");
        int year = leer.nextInt();
        System.out.println("Dame el mes en el que naciste");
        int mes = leer.nextInt()-1;
        System.out.println("Dame el dia en el que naciste");
        int dia = leer.nextInt();
        Date fecha = new Date(year-1900, mes, dia);
        return fecha;
    }

    public Date fechaActual() {

        return new Date();

    }

    public int diferencia(Date fechaInicio, Date fechaFin) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicio);
        int anioInicio = calendar.get(Calendar.YEAR);
        int mesInicio = calendar.get(Calendar.MONTH);
        int diaInicio = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.setTime(fechaFin);
        int anioFin = calendar.get(Calendar.YEAR);
        int mesFin = calendar.get(Calendar.MONTH);
        int diaFin = calendar.get(Calendar.DAY_OF_MONTH);

        int diferenciaAnios = anioFin - anioInicio;
        if (mesFin < mesInicio || (mesFin == mesInicio && diaFin < diaInicio)) {
            diferenciaAnios--;
        }

        return diferenciaAnios;
    }
    
    
    
}
