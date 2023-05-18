/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

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
    
        System.out.println("Elegi una opción para especificar el tipo de bomba (1-4)");
    
    Scanner leer = new Scanner(System.in);
    
    int opcion = leer.nextInt();
    
    switch(opcion){ 
    case(1):
        System.out.println("La bomba es una bomba de agua");
        break;
    
     case(2):
        System.out.println("La bomba es una bomba de gasolina");
         break;
    
     case(3):
            System.out.println("La bomba es una bomba de pasta alimenticia");
         break;
    
     case(4):
            System.out.println("La bomba es una bomba de hormigon");
         break;
    
    
     default:
         System.out.println("No existe un valor válido para tipo de bomba");
    }
    }
}
