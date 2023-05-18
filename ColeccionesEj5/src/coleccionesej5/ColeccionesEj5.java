/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej5;

import Servicio.ServicioProducto;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class ColeccionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> productos = new HashMap<String, Double>();

        ServicioProducto Service = new ServicioProducto();

        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");

            System.out.print("Escribe una de las opciones: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Service.agregarProducto();
                    break;
                case 2:

                    Service.modificarPrecio();
                    break;
                case 3:

                    Service.eliminarProducto();
                    break;
                case 4:
                    Service.mostrarProductos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }
        }
    }
}
