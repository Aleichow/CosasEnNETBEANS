/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra5;

import CUENTA.cuenta;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Objetosextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String sino;
    Scanner leer = new Scanner(System.in);
    
    
    cuenta c1 = new cuenta();
    
    
    c1.establecerCuenta();
    c1.chequearCuenta();
    do {            
            
        c1.retirarDinero();
        
        System.out.println("¿Queres hacer otro retiro?(Y/N)");
        sino=leer.nextLine();
        
        } while (sino.equalsIgnoreCase("y"));
    
    
    
    }
    
}
