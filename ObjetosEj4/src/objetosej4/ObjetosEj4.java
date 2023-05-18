/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosej4;

import Rectangulo.Rectangulo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ObjetosEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        
        
        
        
        System.out.println("Dame la Altura y luego la Base de un rectangulo");
        r1.crearRectangulo(leer.nextInt(), leer.nextInt());
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
       r1.imprimirRectangulo();
    
    
    }

}
