/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.awt.PageAttributes;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class extraseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantas personas son?");
        int per = leer.nextInt();
       double n2 = 0;
       double n3 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < per; i++) {
            
         System.out.println("Cuanto mide en cm: ");
        int n1 = leer.nextInt();
        
            if (n1<160) {
              n2=n2+n1;
              c1++;
            }
            
            n3=n3+n1;
            c2++;
           
            
            
            
            
        }
        
        System.out.println("Hubo "+ c1 + " personas con altura menor a los 1.60 mts y su promedio de altura es: " + (n2/c1)/100  );
        System.out.println("Hubo "+ c2 + " personas en total y su promedio de altura es: " + (n3/c2)/100  );
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
