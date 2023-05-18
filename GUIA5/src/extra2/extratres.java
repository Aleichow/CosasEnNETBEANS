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
public class extratres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        int vec= leer.nextInt();
        int[] v1 = new int [vec];
        llenarAleatorio(v1);
        mostrarVector(v1);
        
    
    
    
    
    
    
    
    
    
    }
    
    public static void llenarAleatorio (int []v1){
    
        for (int i = 0; i < v1.length; i++) {
            v1[i]=(int)(Math.random()*10);
        }
    
    
    
    
    }
    
     public static void mostrarVector (int []v1){
    
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+ " ");
        }
    
    
    
    
    }
    
    
    
}
