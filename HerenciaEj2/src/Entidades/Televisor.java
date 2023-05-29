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
public class Televisor extends Electrodomestico {

    public int resolucion;
    public boolean tdt;

    public Televisor() {

    }

    public Televisor(int resolucion, boolean tdt, String color, char consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;

    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        Scanner sc = new Scanner(System.in);
        super.crearElectrodomestico();

        System.out.println("¿Cuantas pulgadas tiene?");
        setResolucion(sc.nextInt());
        sc.nextLine();
        System.out.println("Tiene sintonizador TDT?");
        String sino = sc.nextLine();
        tdt = sino.equalsIgnoreCase("SI");

    }

    @Override
    public double precioFinal(char consumo, double peso) {
        double precio = 0;

        if (this.resolucion > 40) {

            precio = super.precioFinal(consumo, peso);
            precio = precio + (precio * 0.30);
            System.out.println("se le sumo el 30%");
        } else {
            precio = super.precioFinal(consumo, peso);
            System.out.println("no tiene recargo del 30%");
        }

        if (tdt) {
            precio += 500;
            System.out.println("Se le suma 500 por tener TDT");
            setPrecio(precio);
            return precio;
        } else {
            System.out.println("No se le suma 500 por tener TDT");
            setPrecio(precio);
            return precio;
        }

    }

    @Override
    public String toString() {
        return "Televisor{" + "Resolucion=" + resolucion + "Precio final= " + getPrecio() + " Color=" + getColor() + " Consumo=" + getConsumoEnergetico() + "TDT" + isTdt() + '}';
    }

}
