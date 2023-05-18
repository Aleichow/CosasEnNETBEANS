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
public class MALO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
    
    String frase = leer.nextLine();
    
        System.out.println("La frase normal es: "+ frase);
        
String nueva = codi(frase);

        
    System.out.println("La frase codificada es: "+nueva);
    }
    
    public static String codi (String frase){
        
        String auxfrase = "";
        int largo = frase.length();
        
        for (int i = 0; i < (largo); i++) {
            String letra = frase.substring(i, (i+1));
            
            switch(letra){
                 
                case "A":
        letra="@";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "E":
       letra="#";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "I":
       letra="$";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "O":
         letra="%";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "U":
 letra="*";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "a":
        letra="@";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "e":
       letra="#";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "i":
       letra="$";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "o":
         letra="%";
                    auxfrase=auxfrase+letra;
                    break;
                
                case "u":
 letra="*";
                    auxfrase=auxfrase+letra;
                    break;
                default:
            auxfrase=auxfrase+letra;
        
            }
        
    
    }
       
            return auxfrase;
    
    
    
    
    
    
}
}
