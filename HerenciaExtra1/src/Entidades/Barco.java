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
public class Barco {

    private String matricula;
    private double eslora;
    private int fabricacion;

    public Barco(String matricula, double eslora, int fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public double calcularModulo() {
        return this.eslora * 10;
    }
}


