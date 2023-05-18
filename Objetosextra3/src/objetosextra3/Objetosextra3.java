/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra3;

import JUEGO.juego;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Objetosextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
    
        juego j1 = new juego();
        String sino;
     
        do {
                    j1.comenzarJuego();
                    
                   System.out.println(j1.toString());
                    System.out.println("Queres seguir Jugando: (SI/NO)");
                    
                    sino=leer.nextLine();
                    
        } while (sino.equals("si"));
        

     

    
    }
    
}
