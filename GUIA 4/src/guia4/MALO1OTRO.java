/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MALO1OTRO {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        System.out.println(codificar(cadena));
    }
    
    public static String codificar(String cadena) {
        String frase = "";
       
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.substring(i, (i + 1)).toLowerCase()) {
                case "a":
                    frase = frase + "@";
                    break;
                case "e":
                    frase = frase + "#";
                    break;
                case "i":
                    frase = frase + "$";
                    break;
                case "o":
                    frase = frase + "%";
                    break;
                case "u":
                    frase = frase + "*";
                    break;
                default:
                    frase = frase + cadena.substring(i, i + 1);
            }
        }
        return frase;
        
    }
}
