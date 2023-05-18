/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class cuatrodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    String con;
     do {   
         
         System.out.println("Decime el nombre de la persona: ");
        String nom=leer.nextLine();
        System.out.println("Decime cuantos años tiene: ");
        int edad=leer2.nextInt();
        chequeoEdad(nom, edad);
         System.out.println("Queres seguir: ");
        con = leer.nextLine();
        
            
        } while (!"No".equals(con));
    }
    
    public static void chequeoEdad(String nom, int edad) {
     
        System.out.println(nom+" tiene " + edad+" años.");
        if (edad<18) {
            System.out.println("Es menor de edad");}else{
            System.out.println("Es mayor de edad");
        }
        
        
    }
    
    
    
    
}
