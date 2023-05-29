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
public class Electrodomestico {

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {

        this.precio = 1000;
    }

    public Electrodomestico(String color, char consumoEnergetico, double peso) {

        this.color = comprobarColor(color);
        this.consumoEnergetico = validarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        this.precio = 1000;
    }

    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el peso del electrodomestico en KG");
        this.peso = sc.nextDouble();

        sc.nextLine();

        System.out.println("Dame el color");
        this.color = comprobarColor(sc.nextLine());

        System.out.println("Cual es su consumo energetico");
        this.consumoEnergetico = validarConsumoEnergetico(sc.nextLine().charAt(0));
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = validarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char validarConsumoEnergetico(char consumoEnergetico) {

        if (consumoEnergetico < 'A' || consumoEnergetico > 'F') {
            return 'F';
        } else {
            return consumoEnergetico;
        }

    }

    private String comprobarColor(String color) {

        if (color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO") || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS") || color.equalsIgnoreCase("ROJO")) {
            return color;
        } else {
            color = "BLANCO";
            return color;
        }

    }

    public double precioFinal(char consumo, double peso) {

        switch (consumo) {
            case 'A':
                this.precio += 1000;
                System.out.println("se suma= " + this.precio);
                break;
            case 'B':
                this.precio += 800;
                System.out.println("se suma= " + this.precio);
                break;
            case 'C':
                this.precio += 600;
                System.out.println("se suma= " + this.precio);
                break;
            case 'D':
                this.precio += 500;
                System.out.println("se suma= " + this.precio);
                break;
            case 'E':
                this.precio += 300;
                System.out.println("se suma= " + this.precio);
                break;
            case 'F':
                this.precio += 100;
                System.out.println("se suma= " + this.precio);
                break;
        }
        if (peso >= 1 && peso <= 19) {
            this.precio += 100;
            System.out.println("se suma= " + this.precio);
        } else if (peso >= 20 && peso <= 49) {
            this.precio += 500;
            System.out.println("se suma= " + this.precio);
        } else if (peso >= 50 && peso <= 79) {
            this.precio += 800;
            System.out.println("se suma= " + this.precio);
        } else if (peso >= 80) {
            this.precio += 1000;
            System.out.println("se suma= " + this.precio);
        }
        System.out.println("Se esta devolviendo= " + this.precio);
        return this.precio;
    }

}
