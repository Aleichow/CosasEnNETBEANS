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
public class extraocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);
     int per;
    int c=0;
    int par=0;    
    int impar=0;    
    int a=0;    
        
        do {
            System.out.println("Dame un numero: ");      
                per = leer.nextInt();
            if (per%5!=0) {    
        c++;
                if (per%2==0) {
                    par++;
                }else{
                impar++;}
     } 
        } while (per%5!=0);
        
        System.out.println("La canridad de numeros leidos fueron: "+c+" la cantidad de numeros pares fueorn: "+par+" y la cantidad de numeros impares fueron: "+impar);
        }
    }
    

