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
public class cuatrotres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
    
        Scanner leer2 = new Scanner(System.in);
    
        System.out.println("Decime cuantos euros queres cambiar: ");
        int euro=leer2.nextInt();
        
        System.out.println("Decime a que moneda queres cambiar: ");
        System.out.println("DOLARES/YENES/LIBRAS");
        String nom=leer.nextLine();
        nom=nom.toUpperCase();
        conversion(nom, euro);
        
        
        
        
        
        
        
    }
    
    public static void conversion(String nom, int euro) {
     
        switch(nom){
        
        case "DOLARES":
            System.out.println(euro+" euros son: " + (euro*1.28611)+ " dolares");
                    break;
        
        case "YENES":
                System.out.println(euro+" euros son: " + (euro*129.852)+ " yenes");
            break;
        
        case "LIBRAS":
                System.out.println(euro+" euros son: " + (euro*0.86)+ " libras");
            break;
        
        
        }
               
        
        
        
        }
        
        
    }
    
    
    
    
