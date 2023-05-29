/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class HerenciaEj3 {

    static List<Electrodomestico> electrodomesticos = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Electrodomestico lavadora1 = new Lavadora(50, "AZUL", 'F', 100);
        Electrodomestico lavadora2 = new Lavadora(10, "NEGRO", 'A', 50);

        Electrodomestico tele1 = new Televisor(80, true, "ROJO", 'D', 50);
        Electrodomestico tele2 = new Televisor(30, false, "ROJO", 'B', 10);

        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(tele1);
        electrodomesticos.add(tele2);

        int ac = 0;
        int acu = 0;
        int total = 0;

        for (Electrodomestico aux : electrodomesticos) {
            int precioFinal = aux.precioFinal();

            if (aux instanceof Lavadora) {
                ac += precioFinal;
            } else if (aux instanceof Televisor) {
                acu += precioFinal;
            }
            total += precioFinal;
        }
        System.out.println("El precio de todas las lavadoras es de $" + ac);
        System.out.println("El precio de todos los televisores es de $" + acu);
        System.out.println("El precio total  es de $" + total);
    }

}
