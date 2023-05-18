/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArreglosServicio {

    Scanner leer = new Scanner(System.in);

    public void inicializarA(double[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }

    }

    public void mostrar(double[] arreglo) {

        System.out.println(Arrays.toString(arreglo));

    }

    public void sortA(double[] arreglo) {
        Arrays.sort(arreglo);

        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }

    public void inicializarB(double[] arregloa, double[] arreglob) {

        System.arraycopy(arregloa, 0, arreglob, 0, 10);
        
        
        for (int i = 10; i < 20; i++) {
            arreglob[i] = 0.5;
        }

    }

}
