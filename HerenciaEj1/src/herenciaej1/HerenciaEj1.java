/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej1;

import Entidad.Animales;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author user
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animales p1 = new Perro("Comida Balanceada", "Pepe", "Labrador", 14);
        Animales g1 = new Gato("Pescado", "Tomba", "Siames", 5);
        Animales c1 = new Caballo("Pasto", "Paloma", "Fino", 5);
        
        p1.alimentarse();
        g1.alimentarse();
        c1.alimentarse();
        
        
    }

}
