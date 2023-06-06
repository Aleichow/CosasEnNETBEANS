/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExcepcionesEj3y4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            String numero1Str = sc.nextLine();

            System.out.print("Ingrese el segundo número: ");
            String numero2Str = sc.nextLine();

            int numero1 = Integer.parseInt(numero1Str);
            int numero2 = Integer.parseInt(numero2Str);

            double resultado = (double) numero1 / numero2;

            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e);
            System.out.println(e.fillInStackTrace());
        } finally {
            sc.close();
        }
    }

}
