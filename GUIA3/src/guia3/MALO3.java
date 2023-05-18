package guia3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MALO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        System.out.println("Pone una nota entre 1-10");
    
    Scanner leer = new Scanner(System.in);
    
    int nota = leer.nextInt();
    
        while (nota>10 || nota<0) {            
            System.out.println("Por favor, elegin una nota entre el 1 y el 10");
            nota = leer.nextInt();
        }
   
            System.out.println("La nota es correcta");
        }
    
    }
    
