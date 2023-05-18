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
public class GUIA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
int num1 = 5;
int num2 = 7;
//Puedo invocar el retorno de esta funcion de esta manera
System.out.println("La suma de ambos es: " + sumar(num1,
num2));
int retorno = sumar(num1, num2);
System.out.println("La suma de ambos es: " + retorno);
}
// Pero, recomendamos hacerlo de esta manera, ya que los retornos deben alojarse en variables para su posterior uso
public static int sumar(int num1, int num2) {
int suma;
suma = num1 + num2;
return suma;
    
    
    
    }
    
}
