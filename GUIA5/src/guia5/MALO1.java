/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MALO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    String[] Equipo = new String[9];
    String nom;
        for (int i = 1; i < 9; i++) {
            System.out.println("Dame el nombre del compañero N" + i);
            Equipo[i]= nom = leer.nextLine();
            
            
        }
    
     System.out.println("Los compañeros son: ");
        for (int i = 1; i < 9; i++) {
            System.out.println(Equipo[i]);
        }
    }
    
}
