/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicioguia1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class unocuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos grados Celsius son: ");
        
        int c = leer.nextInt();
        
    double F = 32 + (9*c/5);
    
    
        System.out.println(c + " grados Celsius son: " + F + " grados Farenheit.");
    }
    
}
