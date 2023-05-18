/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej1;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class UtilidadesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CadenaServicio c1s = new CadenaServicio();
        Cadena c1 = new Cadena("Cucurucho");

        System.out.println("La palabra es: ");
        System.out.println(c1.getFrase());
        c1s.mostrarVocales(c1);
        c1s.invertirFrase(c1);
        c1s.invertirDos(c1);
        System.out.println("Dame la letra que queres ver que contenga");
        boolean sino = c1s.contiene(c1, leer.nextLine());
        System.out.println(sino);
        System.out.println("Dame la letra que queres ver que contenga");
        sino = c1s.contienedos(c1, leer.nextLine());
        System.out.println(sino);
        System.out.println("Dame una letra para buscar repetida: ");
        c1s.vecesRepetido(c1, leer.nextLine());
        System.out.println("Dame una frase nueva: ");
        c1s.compararFrase(c1, leer.nextLine());
        System.out.println("Dame otra frase nueva: ");
        c1s.unirFrase(c1, leer.nextLine());
        System.out.println("Dame la letra que queres reemplazar: ");
        c1s.reemplazar(c1, leer.next().charAt(0));

    }

}
