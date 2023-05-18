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
public class extracinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Cuantas filas tiene la matriz: ");
    int n = leer.nextInt();
        System.out.println("Cuantas columnas: ");
    int m = leer.nextInt();
     
     int [][] mat = new int [n][m];
        llenarMatriz(mat, n, m);
        imprimirMatriz(mat, n, m);
    int suma=sumarMatriz(mat, n, m);
    
        System.out.println("La suma de los numeros de la matriz da: " +suma);
    }
    
    public static void llenarMatriz (int [][] mat, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j]=(int) (Math.random()*10);
            }
        }
    }              
    
    public static void imprimirMatriz (int [][] mat, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }  

public static int sumarMatriz (int [][] mat, int n, int m){
    int suma=0;    
    for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma=suma+mat[i][j];
            }
        }
return suma;
}  



}



