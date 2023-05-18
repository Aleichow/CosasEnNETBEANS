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
public class extratres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Dame una letra:"); 
    String letra = leer.nextLine();
    letra=letra.toUpperCase();
    
        if (letra.equals("A")||letra.equals("E")|| letra.equals("I")||letra.equals("O")||letra.equals("U")) {
            System.out.println("Es vocal");
        }  
        else { System.out.println("Es consonante");
        }
        
    }
    
}
