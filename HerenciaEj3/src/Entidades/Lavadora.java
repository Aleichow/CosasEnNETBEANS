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
public class Lavadora extends Electrodomestico {

    private double Carga;

    public Lavadora() {
        super();
    }

    public Lavadora(double Carga, String color, char consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.Carga = Carga;
    }

    public double getCarga() {
        return Carga;
    }

    public void setCarga(double Carga) {
        this.Carga = Carga;
    }

    @Override
    public int precioFinal() {

        double pre = super.precioFinal();
        if (this.Carga > 30) {

            precio += 500;
            pre = precio;
            System.out.println("Se le cargo 500 pesos por la carga");

        }
        
        System.out.println("El precio final para esta lavadora es: " + precio);
        return (int) pre;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es la carga de KG");
        this.Carga = sc.nextDouble();

    }

    @Override
    public String toString() {
        return "Lavadora{" + "Carga=" + Carga + "Precio final= " + getPrecio() + " Color=" + getColor() + " Consumo=" + getConsumoEnergetico() + '}';
    }

}
