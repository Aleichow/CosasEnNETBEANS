/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelaciones;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.List;

/**
 *
 * @author user
 */
public class GuiaRelaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Equipo e1 = new Equipo();
    
    
        Jugador j1 = new Jugador("AA", "BB", "MID", 1);
        Jugador j2 = new Jugador("CC", "DD", "DEF", 2);
        Jugador j3 = new Jugador("EE", "FF", "ARQ", 3);
        Jugador j4 = new Jugador("GG", "HH", "DEL", 4);
        
       e1.agregarJugador(j1);
       e1.agregarJugador(j2);
       e1.agregarJugador(j3);
       e1.agregarJugador(j4);
       
        System.out.println(e1);
    
    }
    
}
