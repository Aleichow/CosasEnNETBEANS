/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosej2;

import Circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ObjetosEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        Circunferencia r1 = new Circunferencia();

        System.out.println("Dame el radio: ");
        r1.crearCircunferencia(leer.nextDouble());

        
        System.out.println(r1.area(r1.getRadio()));
        System.out.println(r1.perimetro(r1.getRadio()));
        
        


    
    
    }
    
}
