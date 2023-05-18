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
public class extracatorce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);   
    int prom;
        System.out.println("Cuantas familias son: ");
    int fam= leer.nextInt();
    int a =0;    
        
    
    
    
    
    for (int i = 1; i < (fam+1); i++) {
            prom=0;  
        System.out.println("Cuantos hijos tiene la familia " + i);
    
    int hijo= leer.nextInt();
      
    System.out.println("Cuales son las edades de los hijos de la familia " + i);
     
      for (int j = 1; j < (hijo+1); j++) {
           
            int edad=leer.nextInt();
           
            a=a+edad;
           
        }
    prom=a/hijo;
     System.out.println("El promedio de edad de los hijos de la familia "+ i + " es: "+prom);
        
    
       }
    
      
    
  
    
    
    }
    
    
   
    

    
    
    
    
    
    
    
    
    
    
    
}
