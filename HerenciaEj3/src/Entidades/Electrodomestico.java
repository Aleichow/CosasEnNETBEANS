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

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

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

     public int precioFinal() {
     double pre = precio;
          
        switch (consumoEnergetico) {
            case 'A':
                pre += 1000;
                break;
            case 'B':
                pre += 800;
                break;
            case 'C':
                pre += 600;
                break;
            case 'D':
                pre += 500;
                break;
            case 'E':
                pre += 300;
                break;
            case 'F':
                pre += 100;             
        }
       if (peso >= 1 && peso <= 19) {
            this.precio += 100;
            pre = this.precio;
            System.out.println("se suma= " + this.precio);
        } else if (peso >= 20 && peso <= 49) {
            this.precio += 500;
            pre = this.precio;
            System.out.println("se suma= " + this.precio);
        } else if (peso >= 50 && peso <= 79) {
            this.precio += 800;
            pre = this.precio;
            System.out.println("se suma= " + this.precio);
        } else if (peso >= 80) {
            this.precio += 1000;
            pre = this.precio;
            System.out.println("se suma= " + this.precio);
        }
        System.out.println("Se esta devolviendo= " + this.precio);
        return (int) pre;
    } 


}
