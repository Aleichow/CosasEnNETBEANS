/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej4;

import Entidades.Peliculas;
import Service.servicePeliculas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ColeccionesEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String sino;
        servicePeliculas sa1 = new servicePeliculas();

        ArrayList<Peliculas> listaPeliculas = new ArrayList<>();

        do {
            sa1.crearAlum();

            System.out.println("¿Desea agregar otra película? (s/n)");
            sino = sc.nextLine();

        } while (sino.equalsIgnoreCase("s"));

        sa1.mostrarPelis();
        System.out.println("MAS DE 1 HORA");
        sa1.mostrarPeliculasMasDe1Hora();
        System.out.println("MAYOR A MENOR");
        sa1.mayoramenor();
        System.out.println("MENOR A MAYOR");
        sa1.menoramayor();
        System.out.println("POR TITULO");
        sa1.porTitulo();
        System.out.println("POR DIRECTOR");
        sa1.porDirector();
    }

}
