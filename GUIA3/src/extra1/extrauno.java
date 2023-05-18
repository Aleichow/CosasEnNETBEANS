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
public class extrauno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Cuantos minutos son: ");
     int min = leer.nextInt();
     
     int horas = min/60;
     
     int dias = horas/24;
     
     horas = horas%24;
     
        System.out.println(min + " minutos equivalen a: " + dias + " dias y " + horas + " horas.");
    
    
    
    
    
    
    
    
    
    
    }
    
}
