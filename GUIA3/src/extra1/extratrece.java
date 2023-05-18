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
public class extratrece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Scanner leer=new Scanner(System.in);   
    
        System.out.println("De cuanto queres la piramide: ");
    int pir = leer.nextInt();
    
        
    
    for (int i = 1; i <(pir+1); i++) {
        
        
        for (int j = 0; j < (i); j++) {
         
            
            
            System.out.print(j+1);    
        }
        
           System.out.println(" ");
               
    
    }
     
    
    
    
    
    
    
    }
    
}
