/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosej3;

import Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ObjetosEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    Operacion n1 = new Operacion();
    
        System.out.println("Dame dos numero: ");
      n1.crearOperacion(leer.nextInt(),leer.nextInt());
    
    
        System.out.println(n1.sumar());
        System.out.println(n1.restar());
        System.out.println(n1.multiplicar());
        System.out.println(n1.dividir());
    
    
    }
    
}
