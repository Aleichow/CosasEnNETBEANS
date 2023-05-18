/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicioguia1;

import java.util.FormattableFlags;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class unotres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        System.out.println("Dame una frase");
        String frase;
        
        Scanner leer = new Scanner(System.in);
        frase=leer.nextLine();//Siempre que sea una frase o algo con espacios es nextLine, sino solo next
     
     frase=frase.toUpperCase();
        System.out.println("La frase en mayusculas es: " + frase);
      
      frase=frase.toLowerCase();
        System.out.println("La frase en minusculas es: " + frase);
       
        //no hace falta pero podemos crear dos variables
      
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
       
        System.out.println("La frase en mayusculas es: " + mayus + " y en minusculas es: " + minus);
    }
    
}
