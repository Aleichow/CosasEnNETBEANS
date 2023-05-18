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
public class extracuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
     
        System.out.println("Dame un numero: ");
     int num = leer.nextInt();
    
        if (num<5) {
            for (int i = 0; i < num; i++) {
                   System.out.print("I");
            }System.out.println(" ");
         
        }else 
            
            if (num==5) {
                System.out.println("V");
        }else if (num<10 && num>5) {
                System.out.print("V");
                for (int i = 5; i < num; i++) {
                    System.out.print("I");
                }System.out.println(" ");
        }else if (num==10) {
                System.out.println("X");
        }

     
         
        }
    
    
    
    }
    


