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
public class MALO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        System.out.println("Dame dos numeros");
        
        Scanner leer = new Scanner(System.in);
    
    int n1, n2;
    
    n1= leer.nextInt();
    n2= leer.nextInt();
    
        if (n1>25 && n2>25) {
            System.out.println("Ambos numeros son mayores a 25");
        } else if (n1>25) {
            System.out.println("El n1 es mayor a 25");
        }else if (n2>25)
            System.out.println("El n2 es mayor a 25");
        else System.out.println("Ninguno de los dos numeros es mayor a 25");
 {
            
            
            
            
        }
    
    
    }
    
    
    
    
    }


