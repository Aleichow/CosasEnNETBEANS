/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra1;

import Cancion.cancion;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Objetosextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        cancion c1 = new cancion();
        cancion c2 = new cancion();
        System.out.println("Dame el titulo de la canción: ");
        c1.setTitulo(leer.nextLine());
        System.out.println("Dame el autor de la canción: ");
        c1.setAutor(leer.nextLine());
        System.out.println(c1.toString());

    }

}
