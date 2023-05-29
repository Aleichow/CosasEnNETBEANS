/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.herencia;

import ENTIDADES.Animales;
import ENTIDADES.Gato;
import ENTIDADES.Interfaz;
import ENTIDADES.Perro;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GUIAHERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Interfaz b = new Perro();
        Interfaz c = new Gato();
        ArrayList<Interfaz> lista = new ArrayList<>();

        b.hacerRuido();
        c.hacerRuido();

        lista.add(b);
        lista.add(c);

         for (Interfaz interfaz : lista) {
            interfaz.hacerRuido();
        }
    }

}
