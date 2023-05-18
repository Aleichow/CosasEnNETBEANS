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
public class extracinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Decime que obra social tenes: ");
        String socio= leer.nextLine();
        socio=socio.toUpperCase();
        System.out.println("Cuanto costo el tratamiento: ");
        double n1 = leer.nextDouble();
        
    switch(socio){
    
    case "A":
        
        n1= n1 -(n1*0.50);
        System.out.println("Usted debe pagar: " +n1 + " pesos");
    break;
    
    case "B":
         n1= n1 -(n1*0.35);
         
         System.out.println("Usted debe pagar: " +n1 + " pesos");
         break;
    case "C":
 
    System.out.println("Usted debe pagar: " +n1 + " pesos");
    break;
    
    
    
    }
    
    
    }
    
}
