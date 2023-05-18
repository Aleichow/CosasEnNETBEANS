/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class extranueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Dame el dividendo: ");
     int divid = leer.nextInt();
        System.out.println("Dame el divisor: ");
     int divis = leer.nextInt();
     int resta = 0;
     int c=0;  
     
        do {
            
         resta = divid - divis;
            
        divid=resta;
         c++;
         
        } while (resta>divis);
        
        System.out.println("El cociente es: "+ c +" y el residuo es: "+ resta);
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
