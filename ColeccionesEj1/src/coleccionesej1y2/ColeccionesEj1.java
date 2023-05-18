/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej1y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ColeccionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        ArrayList<String> r1 = new ArrayList<>();
        String sino;
        String raza;

        do {
            System.out.println("Dame una raza de perro");
            raza = sc.nextLine().toUpperCase();
            r1.add(raza);

            System.out.println("¿Queres salir?(S/N)");
            sino = sc.nextLine();
        } while (sino.equalsIgnoreCase("N"));

        System.out.println("Las razas de perro son: ");
        System.out.println(r1);

        System.out.println("Razas de perros ingresadas:");
        r1.forEach((r) -> {
            System.out.println(r);
        });

        Iterator it = r1.iterator();
        int c = 0;
        System.out.println("Que raza queres eliminar");
        String elimraza = sc.nextLine().toUpperCase();
        while (it.hasNext()) {
            if (it.next().equals(elimraza)) {
                it.remove();
                c++;
                System.out.println("La raza se encontro " + c + " veces.");
            }

        }
        if (c == 0) {
            System.out.println("Esa raza no esta en la lista");
        }
        System.out.println("Las razas de perro son: ");
        System.out.println(r1);
    }

}
