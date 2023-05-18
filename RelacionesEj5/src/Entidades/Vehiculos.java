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
public class Vehiculos {

    public String marca, modelo, color, tipo;

    public int anio, chasis;
    public int nromotor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public int getNromotor() {
        return nromotor;
    }

    public void setNromotor(int nromotor) {
        this.nromotor = nromotor;
    }

    public Vehiculos(String marca, String modelo, String color, String tipo, int anio, int chasis, int nromotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.anio = anio;
        this.chasis = chasis;
        this.nromotor = nromotor;
    }

    public Vehiculos() {
    }
}
