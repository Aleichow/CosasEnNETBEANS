/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej3;

import Entidades.Alumnos;
import Service.serviceAlumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ColeccionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String sino;
        serviceAlumnos sa1 = new serviceAlumnos();

        ArrayList<Alumnos> listaAlumnos = new ArrayList<>();

        do {
            listaAlumnos.add(sa1.crearAlum());

            System.out.println("¿Quiere agregar otro alumno?");
            sino = sc.nextLine();
        } while (sino.equalsIgnoreCase("S"));

        sa1.notaFinal(listaAlumnos);

    }

}
