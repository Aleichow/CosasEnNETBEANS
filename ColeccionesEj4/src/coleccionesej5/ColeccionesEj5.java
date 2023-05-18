/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej5;

import Entidades.Pais;
import Service.servicePaises;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ColeccionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        servicePaises service = new servicePaises();
        String pais;
        boolean continuar = true;

        do {
            System.out.print("Ingrese un país: ");
            pais = scanner.nextLine();
            service.agregarPais(new Pais(pais));
            System.out.print("¿Desea agregar otro país? (S/N): ");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("N")) {
                continuar = false;
            }
        } while (continuar);

        System.out.println("\nPaíses ingresados:\n");
        service.mostrarPaises();

        System.out.println("\nPaíses ordenados alfabéticamente:\n");
        service.mostrarPaisesOrdenados();

        service.eliminarPais();

        service.mostrarPaises();
    }
}
