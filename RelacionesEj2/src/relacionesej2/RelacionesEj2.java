/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2;

import Entidades.Juego;
import Entidades.Jugadores;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class RelacionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Jugadores> jugadores = new ArrayList<>();
        RevolverDeAgua r = new RevolverDeAgua();
        r.llenarRevolver();

        Juego j = new Juego();
        j.cuantosJuegan();

        for (int i = 0; i < j.getCuantos(); i++) {
            jugadores.add(new Jugadores(i + 1));
        }

        j.llenarJuego(jugadores, r);
        j.ronda();

    }

}
