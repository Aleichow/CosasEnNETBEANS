/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2;

import Entidades.Edificio;
import Entidades.Oficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class HerenciaExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Edificio> edificios = new ArrayList<>();

        Polideportivo polideportivo1 = new Polideportivo(20, 10, 30, "Polideportivo 1", "Techado");
        Polideportivo polideportivo2 = new Polideportivo(30, 15, 40, "Polideportivo 2", "Abierto");
        Oficinas edificioOficinas1 = new Oficinas(25, 12, 35, 5, 20, 3);
        Oficinas edificioOficinas2 = new Oficinas(30, 15, 40, 8, 15, 4);

        edificios.add(polideportivo1);
        edificios.add(polideportivo2);
        edificios.add(edificioOficinas1);
        edificios.add(edificioOficinas2);

        edificios.stream().map((edificio) -> {
            System.out.println("Superficie del edificio: " + edificio.calcularSuperficie());
            return edificio;
        }).map((edificio) -> {
            System.out.println("Volumen del edificio: " + edificio.calcularVolumen());
            return edificio;
        }).map((edificio) -> {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Nombre del polideportivo: " + polideportivo.getNombre());
                System.out.println("Tipo de instalación: " + polideportivo.getTipoInstalacion());
            } else if (edificio instanceof Oficinas) {
                Oficinas edificioOficinas = (Oficinas) edificio;
                System.out.println("Número de oficinas: " + edificioOficinas.getNroOficinas());
                System.out.println("Personas por oficina: " + edificioOficinas.getPersonasXOficina());
                System.out.println("Número de pisos: " + edificioOficinas.getNroPisos());
                edificioOficinas.cantPersonas();
            }
            return edificio;
        }).forEachOrdered((_item) -> {
            System.out.println("------------------------");
        });
    }

}


