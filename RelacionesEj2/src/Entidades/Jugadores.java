/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Jugadores {

    Scanner sc = new Scanner(System.in);

    public int id;

    public String nombre;

    public boolean mojado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    

    public Jugadores(int id) {

        if (id < 1 || id > 6) {
            this.id = 6;
        } else {
            this.id = id;
        }
        this.nombre = "Jugador " + this.id;
        this.mojado = false;
    }

    public Jugadores() {
    }

    public boolean disparo(RevolverDeAgua r) {
        r.siguienteChorro();
        if (r.mojar()) {
            this.mojado = true;
            return true;
        } else {
            return false;
        }

    }

}
