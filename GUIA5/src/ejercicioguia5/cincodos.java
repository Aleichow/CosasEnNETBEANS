/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class cincodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
    
        System.out.println("Cuantas dimensiones tiene el vector");
     int vec=leer.nextInt();
     
     int[] num = new int[vec];
     int ale;
    int busqueda;
    int c=0;
        System.out.println("¿Que numero queres buscar?");
    busqueda=leer.nextInt();
        System.out.println("El numero que queres buscar es: " + busqueda);
        
        for (int i = 0; i < vec; i++) {
            
            ale= (int)(Math.random()*10);
            num[i]=ale;
            System.out.println(num[i]);
            
            if (ale==busqueda) {
                System.out.println("El valor que querias buscar esta ubicado en la dimension " + i);
            c++;
            }
            
          
                      
        }
    
      if (c>1) {
                  System.out.println("El valor se repite " + c+ " veces");

            }if(c==1) 
                    {
                System.out.println("El valor solo aparece una vez");
            }else{System.out.println("El valor no aparece");
            
            
            }
    
    }
    
}
