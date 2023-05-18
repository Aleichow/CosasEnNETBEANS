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
public class extradiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer= new Scanner(System.in);
        
    
    
    
    int num = (int)(Math.random()*10);
    
    
     int guess;
   
    
    
        do {            
            
        guess = leer.nextInt();
            
            if (guess!=num) {
                System.out.println("Incorrecto, ingresa de vuelta el numero");
            }
        } while (guess!=num) ;
        
        System.out.println("Correcto, felicitaciones adivinaste el numero");
        
        
    }
    
}
