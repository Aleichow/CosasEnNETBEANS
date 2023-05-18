/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Equipo {

    public ArrayList<Jugador> jugadores;

    public Equipo() {
    jugadores = new ArrayList<>();
    
    }

    public Equipo(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador j) {

        jugadores.add(j);

    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }

}
