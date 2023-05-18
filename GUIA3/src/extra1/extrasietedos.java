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
public class extrasietedos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos numeros son?");
        int per = leer.nextInt();
    int c=0;
    int max=0;    
    int min=0;    
    int a=0;    
        
    
    System.out.println("Dame "+per+ " numeros");
    do {
               
             int num = leer.nextInt();
             
             a=num+a;
            
             if (num>max) {
             max=num;
            }
             
             
             if (c==0) {
                
                 min=num;
            }else if (c>0 && num<min) {
                min=num;
            }
            
            c++;
            
        } while (c!=per);
        
           
    
        System.out.println("El maximo fue: "+max+" El minimo fue: "+min+" y el promedio fue: " +a/per);
    
    
    }
    
}
