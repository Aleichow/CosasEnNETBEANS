package Ejercicio2y3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Main {

    static List<Electrodomestico> electrodomesticos = new ArrayList();

//    public Main(List<Electrodomestico> electrodomesticos) {
//        this.electrodomesticos = new ArrayList();
//    }
    
    public static void main(String[] args) {
        List<Electrodomestico> electrodomestico;
        
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Lavadora lavadora = new Lavadora();

        //lavadora.crearLavadora();
        //System.out.println("EL precio de la lavadora es de: $" + lavadora.precioFinal());

        //Televisor tele = new Televisor();
        //tele.crearTelevisor();
        //System.out.println("EL precio del televisor es de: $" + tele.precioFinal());

        //System.out.println(lavadora);
        //System.out.println(tele);

        Electrodomestico la = new Lavadora(20, 2000, "Blanca", 30, "A");
        Electrodomestico lav = new Lavadora(40, 5000, "Negra", 30, "B");
        Electrodomestico tv = new Televisor(42, true, 3000, "Negro", 30, "B");
        Electrodomestico tev = new Televisor(32, false, 1500, "Negro", 20, "C");
        electrodomesticos.add(la);
        electrodomesticos.add(lav);
        electrodomesticos.add(tv);
        electrodomesticos.add(tev);

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
        System.out.println("El precio de todas las lavadoras es de $"+ac);
        System.out.println("El precio de todos los televisores es de $"+acu);
        System.out.println("El precio total  es de $"+total);
    }



}