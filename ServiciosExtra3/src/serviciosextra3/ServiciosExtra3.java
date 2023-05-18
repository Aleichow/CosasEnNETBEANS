/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra3;

import Entidad.Fracciones;
import Servicios.FraccionesServicio;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServiciosExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        FraccionesServicio fraccionService = new FraccionesServicio();
        Fracciones f1 = new Fracciones();

        f1 = fraccionService.crearFraccion();

        int opcion;

        do {

            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Sumar fracciones");
            System.out.println("2. Restar fracciones");
            System.out.println("3. Multiplicar fracciones");
            System.out.println("4. Dividir fracciones");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    fraccionService.sumar(f1);
                    break;
                case 2:
                    fraccionService.restar(f1);
                    break;
                case 3:
                    fraccionService.multi(f1);
                    break;
                case 4:
                    fraccionService.divi(f1);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 5);
    }
}
