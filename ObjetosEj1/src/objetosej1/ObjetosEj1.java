/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosej1;

import Libro.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ObjetosEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);

        Libro p1 = new Libro();

        System.out.println("Dame el ISBN del libro: ");
        p1.declararISBN(leer.nextInt());
        System.out.println("Dame el numero de páginas: ");
        p1.declararPaginas(leer.nextInt());
        System.out.println("Dame el autor: ");
        p1.declararAutor(leer2.nextLine());
        System.out.println("Dame el titulo: ");
        p1.declararTitulo(leer2.nextLine());

        ArrayList<Libro> ejemplares = new ArrayList();
        ejemplares.add(p1);
        for (Libro ejemplare : ejemplares) {
            System.out.println(ejemplare);
        }

    }

}
