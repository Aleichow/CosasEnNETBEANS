/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra1;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.Velero;
import Entidades.Yates;
import Entidades.aMotor;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class HerenciaExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del alquiler:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Documento: ");
        String documento = sc.nextLine();
        System.out.print("Fecha de alquiler (yyyy-MM-dd): ");
        LocalDate fechaAlquiler = LocalDate.parse(sc.nextLine());
        System.out.print("Fecha de devolución (yyyy-MM-dd): ");
        LocalDate fechaDevolucion = LocalDate.parse(sc.nextLine());
        System.out.print("Posición del amarre: ");
        int posicionAmarre = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese los datos del barco:");
        System.out.print("Tipo de barco (1: Velero, 2: Barco a motor, 3: Yate de lujo): ");
        int tipoBarco = sc.nextInt();
        sc.nextLine();
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();
        System.out.print("Eslora: ");
        double eslora = sc.nextDouble();
        sc.nextLine();
        System.out.print("Año de fabricación: ");
        int fabricacion = sc.nextInt();
        sc.nextLine();

        Barco barco;

        switch (tipoBarco) {
            case 1:
                System.out.print("Número de mástiles: ");
                int numeroMastiles = sc.nextInt();
                barco = new Velero(matricula, eslora, fabricacion, numeroMastiles);
                break;
            case 2:
                System.out.print("Potencia en CV: ");
                int potenciaCV = sc.nextInt();
                barco = new aMotor(matricula, eslora, fabricacion, potenciaCV);
                break;
            case 3:
                System.out.print("Potencia en CV: ");
                potenciaCV = sc.nextInt();
                System.out.print("Número de camarotes: ");
                int numeroCamarotes = sc.nextInt();
                barco = new Yates(matricula, eslora, fabricacion, potenciaCV, numeroCamarotes);
                break;
            default:
                System.out.println("Tipo de barco inválido");
                return;
        }

        Alquiler alquiler = new Alquiler(nombre, documento, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        double precioAlquiler = alquiler.calcularPrecioAlquiler();

        System.out.println("El precio del alquiler es: $" + precioAlquiler);
    }
}
