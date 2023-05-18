/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ParDeNumerosServicio {

    Scanner leer = new Scanner(System.in);

    public void mostrarValores(ParDeNumeros parDeNumeros) {

        System.out.println("El N1 es: " + parDeNumeros.getN1() + " Y el N2 es: " + parDeNumeros.getN2());
    }

    public double mayor(ParDeNumeros parDeNumeros) {

        return Math.max(parDeNumeros.getN1(), parDeNumeros.getN2());
    }

    public double potencia(ParDeNumeros parDeNumeros) {

        double max = mayor(parDeNumeros);

        double min = Math.min(parDeNumeros.getN1(), parDeNumeros.getN2());

        max = Math.round(max);
        System.out.println("El valor max es: " + max);
        
        min = Math.round(min);
        System.out.println("El valor Min es: " + min);
        return Math.pow(max, min);
    }

    public double raiz(ParDeNumeros parDeNumeros) {

        double min = Math.min(parDeNumeros.getN1(), parDeNumeros.getN2());

        min = Math.abs(min);

        return Math.sqrt(min);
    }

}
