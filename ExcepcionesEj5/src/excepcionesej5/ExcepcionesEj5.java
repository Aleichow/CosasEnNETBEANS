/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExcepcionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 0;
        boolean adivinado = false;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¡Adivina el número entre 1 y 500!");
            
            while (!adivinado) {
                try {
                    System.out.print("Introduce un número: ");
                    int numero = scanner.nextInt();
                    intentos++;
                    
                    if (numero == numeroAdivinar) {
                        adivinado = true;
                        System.out.println("¡Has adivinado el número!");
                    } else if (numero < numeroAdivinar) {
                        System.out.println("El número a adivinar es mayor.");
                    } else {
                        System.out.println("El número a adivinar es menor.");
                    }
                } catch (InputMismatchException e) {
                    intentos++;
                    System.out.println("Error: Debes ingresar un número válido.");
                    scanner.nextLine(); // Consumir la entrada inválida
                }
            }
            
            System.out.println("Número de intentos: " + intentos);
        }

    }

}
