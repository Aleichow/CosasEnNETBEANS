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
public class cincoseismejorado {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 
        al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
        Crear un programa que permita introducir un cuadrado por teclado y determine 
        si este cuadrado es mágico o no. El programa deberá comprobar que los números 
        introducidos son correctos, es decir, están entre el 1 y el 9.
         */
        int sumar = 0;
        int[] suma = new int[3];
        boolean bandera = false;
        int[][] matriz = new int[3][3];
        int[][] retorno1 = llenarMatriz(matriz);
        int[][] retorno2 = mostrarMatriz(matriz);
        int comparacion = sumaFilaGuia(matriz);
        boolean retorno3 = SumaFilasMatriz(matriz, suma, bandera);
        boolean retorno4 = SumaColumnasMatriz(matriz, suma, bandera);
        boolean retorno5 = SumaDiagonalInvertidaMatriz(matriz, comparacion, sumar, bandera);
        boolean retorno6 = SumaDiagonalPrincipalMatriz(matriz, comparacion, sumar, bandera);
        if(retorno3 && retorno4 && retorno5 && retorno6){
            System.out.println("La matriz es mágica!!");
        }else{
            System.out.println("La matriz NO es mágica :c");
        }
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num;
                do {
                    System.out.println("Ingresa un número entre 1 y 9");
                    num = leer.nextInt();
                } while (num < 1 || num > 9);
                matriz[i][j] = num;
            }
        }
        return matriz;
    }

    public static int[][] mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[i][j] + " ]" + " ");
            }
            System.out.println(" ");
        }
        return matriz;
    }

    public static int sumaFilaGuia(int[][] matriz) {
        int sumaFG = 0;
        for (int i = 0; i < 3; i++) {
            sumaFG = 0;
            for (int j = 0; j < 3; j++) {
                sumaFG += matriz[i][j];
            }
        }
        System.out.println("comparacion" + sumaFG);
        return sumaFG;
    }

    public static boolean SumaFilasMatriz(int[][] matriz, int[] suma, boolean bandera) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i] += matriz[i][j];
            }
        }
        if ((suma[0] == suma[1]) && (suma[1] == suma[2]) && (suma[0] == suma[2])) {
            bandera = true;
            System.out.println("La suma de las filas son iguales : " + bandera);
        } else {
            System.out.println("La suma de las filas no son iguales:");
        }
        return bandera;
    }

    public static boolean SumaColumnasMatriz(int[][] matriz, int[] suma, boolean bandera) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i] += matriz[j][i];
            }
        }
        if ((suma[0] == suma[1]) && (suma[1] == suma[2]) && (suma[0] == suma[2])) {
            bandera = true;
            System.out.println("La suma de las columnas son iguales : " + bandera);
        } else {
            System.out.println("La suma de las columnas no son iguales:");
        }
        return bandera;
    }

    public static boolean SumaDiagonalInvertidaMatriz(int[][] matriz, int sumaFG, int sumar, boolean bandera) {
        int i = 0;
        for (int j = 2; j >= 0; j--) {
            sumar += matriz[i][j];
            i++;
        }
        if (sumaFG == sumar) {
            bandera = true;
            System.out.println("La suma de la diagonal invertida es: " + bandera);
        } else {
            bandera = false;
        }
        return bandera;
    }

    public static boolean SumaDiagonalPrincipalMatriz(int[][] matriz, int sumaFG, int sumar, boolean bandera) {
        for (int i = 0; i < 3; i++) {
            sumar += matriz[i][i];
        }
        if (sumaFG == sumar) {
            bandera = true;
            System.out.println("La suma de la diagonal principal es :" + bandera);
        } else {
            bandera = false;
        }
        return bandera;
    }
    
}
