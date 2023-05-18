/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MALO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame 4 numeros: ");
        
        int num1 = leer.nextInt();
       
        int num2 = leer.nextInt();
       
        int num3 = leer.nextInt();
       
        int num4 = leer.nextInt();
         
        System.out.print("El n1 es " + num1 + " ");
       
        for (int i = 0; i!=num1; i++) {
            System.out.print("*");  
        }
        System.out.println(" ");
     System.out.print("El n2 es " + num2 + " ");
         for (int i = 0; i!=num2; i++) {
            System.out.print("*");  
        }
        System.out.println(" ");        
 System.out.print("El n3 es " + num3 + " ");
        for (int i = 0; i!=num3; i++) {
            System.out.print("*");  
        }
        System.out.println(" ");
     System.out.print("El n4 es " + num4 + " ");
     for (int i = 0; i!=num4; i++) {
            System.out.print("*");  
              
     }
 System.out.println(" "); 
    }
    

 


}
