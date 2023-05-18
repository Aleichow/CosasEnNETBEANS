/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class Peliculas {

    private String Titulo, Director;
    private double horas;

    public Peliculas() {
    }

    public Peliculas(String Titulo, String Director, double horas) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.horas = horas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "Titulo=" + Titulo + ", Director=" + Director + ", horas=" + horas + '}';
    }

}
