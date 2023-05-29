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
public class Oficinas extends Edificio {

    Scanner sc = new Scanner(System.in);
    private int nroOficinas, personasXOficina, nroPisos;

    public Oficinas() {
    }

    public Oficinas(double ancho, double alto, double largo, int nroOficinas, int personasXOficina, int nroPisos) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.nroOficinas = nroOficinas;
        this.personasXOficina = personasXOficina;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public int getPersonasXOficina() {
        return personasXOficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    public void cantPersonas() {
        int personasEnPiso = personasXOficina * nroOficinas;
        int personasEnEdificio = personasEnPiso * nroPisos;
        System.out.println("Personas por piso: " + personasEnPiso);
        System.out.println("Personas en el edificio: " + personasEnEdificio);

    }
}
