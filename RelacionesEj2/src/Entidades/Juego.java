/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Juego {

    Scanner sc = new Scanner(System.in);
    private ArrayList<Jugadores> jugadores;
    private RevolverDeAgua revolver;
    private int cuantos;

    public int getCuantos() {
        return cuantos;
    }

    public void setCuantos(int cuantos) {
        this.cuantos = cuantos;
    }

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.revolver = new RevolverDeAgua();
    }

    public void llenarJuego(ArrayList<Jugadores> j, RevolverDeAgua r) {

        this.jugadores = j;
        this.revolver = r;

    }

    public void ronda() {
        boolean fin = false;
        int i = 0;
        while (!fin) {
            Jugadores j = this.jugadores.get(i);
            fin = j.disparo(this.revolver);
            if (fin) {
                System.out.println(j.getNombre() + " se mojó");
            } else {
                System.out.println(j.getNombre() + " no se mojó");
                i++;
                if (i == this.jugadores.size()) {
                    i = 0;
                }
            }
        }
    }

    public void cuantosJuegan() {

        System.out.println("¿Cuantos jugadores van a ser?");
        this.cuantos = sc.nextInt();

        if (this.cuantos > 6) {
            this.cuantos = 6;
        }

    }

}
