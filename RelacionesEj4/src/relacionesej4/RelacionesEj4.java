/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej4;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;

/**
 *
 * @author user
 */
public class RelacionesEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Pelicula pelicula = new Pelicula("Titanic", 120, 16, "James Cameron");
        
        Cine cine = new Cine(pelicula, 100);

        cine.inicializarSala();
        
        
        Espectador espectador1 = new Espectador("Juan", 20, 150);
        Espectador espectador2 = new Espectador("María", 15, 80);
        Espectador espectador3 = new Espectador("Pedro", 25, 200);
        Espectador espectador4 = new Espectador("Ana", 10, 50);
        Espectador espectador5 = new Espectador("Carlos", 18, 120);

        cine.agregarEspectador(espectador1);
        cine.agregarEspectador(espectador2);
        cine.agregarEspectador(espectador3);
        cine.agregarEspectador(espectador4);
        cine.agregarEspectador(espectador5);

        cine.mostrarSala();
    }

}
