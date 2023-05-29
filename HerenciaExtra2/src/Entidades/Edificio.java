/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author user
 */
public abstract class Edificio {

    protected double ancho, alto, largo;

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

}
