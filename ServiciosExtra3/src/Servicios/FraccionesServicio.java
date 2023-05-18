/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Fracciones;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FraccionesServicio {

    Scanner leer = new Scanner(System.in);

    public Fracciones crearFraccion() {

        System.out.println("Dame el Numerador y Denominador de la primer fraccion");
        int n1 = leer.nextInt();
        int d1 = leer.nextInt();

        System.out.println("Dame el Numerador y Denominador de la segunda fraccion");
        int n2 = leer.nextInt();
        int d2 = leer.nextInt();

        return new Fracciones(d1, n1, d2, n2);
    }

    public void sumar(Fracciones fracciones) {

        int num = fracciones.getN1() * fracciones.getD2() + fracciones.getN2() * fracciones.getD1();

        int den = fracciones.getD1() * fracciones.getD2();

        System.out.println("La suma de las fracciones da como resultado" + num + "/" + den);

    }

    public void restar(Fracciones fracciones) {

        int num = fracciones.getN1() * fracciones.getD2() - fracciones.getN2() * fracciones.getD1();

        int den = fracciones.getD1() * fracciones.getD2();

        System.out.println("La resta de las fracciones da como resultado" + num + "/" + den);

    }

    public void multi(Fracciones fracciones) {

        int num = fracciones.getN1() * fracciones.getN2();

        int den = fracciones.getD1() * fracciones.getD2();

        System.out.println("La multiplicación de las fracciones da como resultado" + num + "/" + den);

    }

    public void divi(Fracciones fracciones) {

        int num = fracciones.getN1() * fracciones.getD2();

        int den = fracciones.getD1() * fracciones.getN2();

        System.out.println("La division de las fracciones da como resultado" + num + "/" + den);

    }

}
