/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MALO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
    
    
        System.out.println("Dame el numero 1: ");
     int num1 = leer.nextInt();
        System.out.println("Dame el numero 2: ");
     int num2 = leer.nextInt();
    
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int num1, int num2) {

        
        if (num1%num2==0) {
            System.out.println(num1+" es multiplo de "+num2);
        }else{
            System.out.println(num1+" no es multiplo de "+num2);
        }
        
        
}
    
    
    
    
    
}
