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
public class cuatrocuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Dame un numero: ");
    
    int num = leer.nextInt();
    
        if (primo(num)) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    public static boolean primo(int num){
        

        if (num<=1) {//un numero menor o igual a uno no es primo
            return false;
        }
        
        int cont =0;
        for ( int i = 1; i <= num ; i++) {
            if ((num%i)==0) {//aca lo que hacemos es contabilizar todos los divisibles 
                
                System.out.println(num%i);  
                cont++;
            }
        
        
        
        }
        
        if(cont==2) {
            return true;
        }else{
        
         return false;
        
        }
        
        
       
        
       
    
}
}
