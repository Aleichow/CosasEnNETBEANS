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
public class cincoseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[][] matriz = new int[3][3];
    Scanner leer = new Scanner(System.in);
int vec;    
int filas[]={0,0,0};
int sumf=0;
int colum[]={0,0,0};
int sumc=0;
int diag[]={0,0};
int sumd=0;  
//llenamos la matriz
System.out.println("Ingresa 9 numeros para llenar la matriz (entre 1-9)");
for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                do {
                    
                    
                     matriz[i][j]=vec=leer.nextInt();
                     if (vec<1||vec>9) {
                         System.out.println("Los numeros tienen que ser entre 1 y 9");
                    }
                     
                } while (vec<1||vec>9);
            }
    }
     //sumamos las filas y la diagonal principal
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                filas[i]= filas[i] + matriz[i][j];
            
                if (i==j) {
                    diag[0] = diag[0]+matriz[i][j];
                }
            }
       
        }
     //sumamos las columnas
       for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                colum[i]= colum[i] + matriz[j][i];
            }
       
       }
       
    int k=3;
        for (int i = 0; i < 3; i++) {
            k--;
                diag[1] = diag[1]+matriz[i][k];
              
        }
       
        k=0;
        for (int i = 0; i < 3; i++) {
           
                if (colum[i]==filas[i]) {
            }else {
                k++;
                
                }
            for (int j = 0; j < 2; j++) {
                 if (colum[i]==diag[j]&&filas[i]==diag[j]) {
            }else {
                
                     k++;
                
                }   
            }
        }
        if (k==0) {
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
    }   
}
