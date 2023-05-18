/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MALO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     Scanner leer = new Scanner(System.in);
    
int num;
int num2=0;
    
    
       

do{
     System.out.println("Dame un numero");

 num  = leer.nextInt();
    
    ++num2;
    
    System.out.println(num2);
    }

    while (num!=0 || num2!=20); 
       
  
        if (num ==0) {
            System.out.println("Se ha detectado el 0");
        }else
            System.out.println("El contador llego a 20");
}
    
    
}
