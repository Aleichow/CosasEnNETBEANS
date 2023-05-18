/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra2;

import java.util.Scanner;
import puntos.puntos;

/**
 *
 * @author user
 */
public class Objetosextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        puntos p1 = new puntos();

        System.out.println("Dame la x del punto 1");
        p1.setX1(leer.nextInt());
        System.out.println("Dame la y del punto 1");
        p1.setY1(leer.nextInt());
        System.out.println("Dame la x del punto 2");
        p1.setX2(leer.nextInt());
        System.out.println("Dame la y del punto 2");
        p1.setY2(leer.nextInt());

        p1.crearPuntos(p1.getX1(), p1.getY1(), p1.getX2(), p1.getY2());

    
        System.out.println(p1.calcularDistancia());
        p1.calcularDistancia2();
    }

}
