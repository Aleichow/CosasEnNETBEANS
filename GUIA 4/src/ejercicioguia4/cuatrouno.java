/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class cuatrouno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    
        System.out.println("Dame dos numeros: ");
    int num1=leer.nextInt();
    int num2=leer.nextInt();
    
    
        System.out.println("Decime que queres que les hagamos: ");
    
        String op = leer2.nextLine();
    op=op.toLowerCase();
        switch (op) {
            case "sumar":
                System.out.println("La suma de los dos numeros es: " + suma(num1, num2));
                break;
            case "restar":
                System.out.println("La resta de los dos numeros es: " + resta(num1, num2));
                break;
            case "multiplicar":
                System.out.println("La multiplicación de los dos numeros es: " + multiplicacion(num1, num2));
                break;
            case "division":
                System.out.println("La division de los dos numeros es: " + division(num1, num2));
                break;
            
            default:
                System.out.println("No elegiste nada correcto. Adios!");;
        }
    }
    public static int suma(int num1, int num2) {

        int sumado = num1+num2;
      
        return sumado;
        
}
    public static int resta(int num1, int num2) {

        int restado = num1-num2;
      
        return restado;
        
}
    public static int multiplicacion(int num1, int num2) {

        int multiplicado = num1*num2;
      
        return multiplicado;
        
}
    public static int division(int num1, int num2) {

        int dividido = num1/num2;
      
        return dividido;
        
}
    
    
    
    
    
    
    
}
