/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class dostres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in);
       
       int largo;
        
        do {
            
            
        System.out.println("Dame una frase; ");
        String frase = leer.nextLine();
    
          largo = frase.length();
            
            if (largo!=8) {
                System.out.println("Incorrecto");
            }
        
        }
        while(largo!=8); {
       
        
        System.out.println("Correcto");
    }  
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }


}
   
