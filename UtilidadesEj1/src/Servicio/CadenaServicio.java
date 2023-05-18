/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidad.Cadena;

/**
 *
 * @author user
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    public void mostrarVocales(Cadena cadena) {
        int contadorVocales = 0;
        char c;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            c = cadena.getFrase().toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Esta palabra contiene: " + contadorVocales + " vocales.");
    }

    public void invertirFrase(Cadena cadena) {
        char[] arrayFrase = new char[cadena.getLongitud()];

        for (int i = 0; i < cadena.getLongitud(); i++) {
            arrayFrase[i] = cadena.getFrase().toLowerCase().charAt(i);

        }
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            System.out.print(arrayFrase[i]);
        }

        System.out.println(" ");
    }

    public void invertirDos(Cadena cadena) {
        StringBuilder sb = new StringBuilder(cadena.getFrase());

        System.out.println(sb.reverse().toString());

    }

    public void vecesRepetido(Cadena cadena, String letra) {
        int repetido = 0;
        char c;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            c = cadena.getFrase().toLowerCase().charAt(i);
            if (letra.equals(String.valueOf(c))) {
                repetido++;
            }

        }

        System.out.println("La letra " + letra + " se repite: " + repetido + " veces.");
    }

    public void compararFrase(Cadena cadena, String Frase) {

        if (cadena.getLongitud() == Frase.length()) {
            System.out.println("Las frases miden lo mismo");
        } else if (cadena.getLongitud() > Frase.length()) {
            System.out.println("La frase original mide mas");
        } else {
            System.out.println("La frase nueva mide mas");
        }
    }
    public void unirFrase(Cadena cadena, String Frase) {
        System.out.println("La frase concatenada es: " + cadena.getFrase().concat(Frase));
        
    }
    public void reemplazar(Cadena cadena, char Letra) {
        System.out.println("Dame la letra que queres agregar");
        String frasenueva = cadena.getFrase().replace(Letra,leer.next().charAt(0));
        System.out.println("La frase nueva es: " + frasenueva);
    }

    public boolean contiene(Cadena cadena, String letra) {
        boolean sino = false;
        char c;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            c = cadena.getFrase().toLowerCase().charAt(i);
            if (letra.equals(String.valueOf(c))) {
                sino=true;
                break;
            }

        }

        return sino;
    }

    
       public boolean contienedos(Cadena cadena, String letra) {
        return cadena.getFrase().indexOf(letra) !=-1;
    }
    
}
