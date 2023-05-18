/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera Cafetera) {

        System.out.println("Se esta llenando la cafetera...");
        Cafetera.setCantidadActual(Cafetera.getCapacidadMaxima());
        System.out.println("Llena");

    }

    public void servirTaza(Cafetera Cafetera) {

        System.out.println("Cual es el tamaño de la taza");
        int tamañoTaza = leer.nextInt();
        int taza = 0;
        System.out.println("Se procedera a llenar la taza");
        if (Cafetera.getCantidadActual() < tamañoTaza) {
            System.out.println("La cantidad actual no permite llenar al tope la taza, por lo cual se la lleno hasta donde daba");
            taza = Cafetera.getCantidadActual();
            Cafetera.setCantidadActual(Cafetera.getCantidadActual() - taza);
        } else {
            taza = Cafetera.getCantidadActual() - tamañoTaza;
            Cafetera.setCantidadActual(Cafetera.getCantidadActual() - tamañoTaza);

            System.out.println("La taza se lleno quedan: " + Cafetera.getCantidadActual());

        }
    }

    public void vaciarCafetera(Cafetera Cafetera) {
        System.out.println("La cafetera tenia: " + Cafetera.getCantidadActual() + " ML de cafe adentro");
        Cafetera.setCantidadActual(0);
        System.out.println("Ahora tiene: " + Cafetera.getCantidadActual());
    }

    public void agregarCafe(Cafetera Cafetera) {

        System.out.println("¿Con cuanto queres llenar la cafetera?");
        int llenado = leer.nextInt();

        if (llenado > Cafetera.getCapacidadMaxima() || (llenado + Cafetera.getCantidadActual()) > Cafetera.getCapacidadMaxima()) {
            System.out.println("La cafetera rebalsaria, no la vas a llenar");
        } else {

            Cafetera.setCantidadActual(Cafetera.getCantidadActual() + llenado);

        }

    }

}
