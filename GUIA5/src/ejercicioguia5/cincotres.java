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
public class cincotres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas dimensiones tiene el vector");
     int vec=leer.nextInt();
     
     int[] num = new int[vec];
    
    int busqueda;
    int c1=0;
    int c2=0;
    int c3=0;
    int c4=0;
    int c5=0;
    
        for (int i = 0; i < vec; i++) {
            
            num[i]= (int)(Math.random()*99999);
           
            System.out.println(num[i]);
            
            if (num[i]>0&&num[i]<10) {
                            c1++;
            }
            if (num[i]>=10&&num[i]<=99) {
                            c2++;
            }
            if (num[i]>=100&&num[i]<=999) {
                            c3++;
            }
            if (num[i]>=1000&&num[i]<=9999) {
                            c4++;
            }
            if (num[i]>=10000&&num[i]<=99999) {
                            c5++;
            }
        }
        System.out.println("Hubo " +c1+" numeros de un digito, "+c2+" numeros de dos digitos, "+c3+ " numeros de tres digitos, "+c4+" numeros de 4 digitos, "+c5+" y numeros de 5 digitos");
    }
    
}
