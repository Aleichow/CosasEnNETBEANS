/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class dosocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
        System.out.println("Dame un numero: ");   
     int num = leer.nextInt();
        int num2 = num-1;
        System.out.println("El numero es: " + num);
       
        for (int i = 0; i<num; i++) {
          
            for (int j = 0; j <num; j++) {
                
              if (j==0 || j==num2|| i==0 || i==num2) {
                    System.out.print("*");
                }else{
                  System.out.print(" "
                          + "");
              }
                
                
            } System.out.println(" ");
        
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    







}
