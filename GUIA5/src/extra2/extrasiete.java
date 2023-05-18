/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class extrasiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("¿Que termino de la cadena fibonacci queres?");
        int n= leer.nextInt();
        int [] f= new int [n];
      
        
        
        for (int i = 0; i < f.length; i++) {
            
            if (i<=1) {
                f[i]=1;
            } else {  
                
                f[i] = f[i-1]+f[i-2];
            }
        }
    
    
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i]+" ");
        }
        System.out.println("");
    
    
    }
    
}
