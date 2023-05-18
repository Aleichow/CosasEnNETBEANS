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
public class unouno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int num;
    int num2;
    
     Scanner leer = new Scanner(System.in); //tipo de variable que lee texto
            
        System.out.println("Dame dos numeros");
        
    num = leer.nextInt();
    num2 = leer.nextInt();
    
    int suma = num+num2;
    
        System.out.println("La suma de esos dos numeros es: " + suma);
    
    }
    
}
