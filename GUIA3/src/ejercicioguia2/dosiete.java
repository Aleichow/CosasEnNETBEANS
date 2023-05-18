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
public class dosiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
    
    String frase;
    
    int cor=0;
    int incor=-1;
    
        do {
            System.out.println("Dame una frase: ");
            frase = leer.nextLine();
            frase = frase.toUpperCase();
                  int largo = frase.length();
                  
                  
                  String prin = frase.substring(0,1);
                  String fin = frase.substring(4,5);
        
            if (largo==5 && prin.equalsIgnoreCase("X") && fin.equalsIgnoreCase("O")) {
                ++cor;
            }else{ ++incor;
            
            
            }
        
        } while (!"&&&&&".equals(frase));
        
        System.out.println("Los correctos fueron: " + cor + " y los incorrectos fueron: " + incor);
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
