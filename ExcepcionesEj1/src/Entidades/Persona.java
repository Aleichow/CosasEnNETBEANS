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
public class Persona {

    private String nombre, sexo;
    private int edad;
    private double peso, altura;

    public Persona() {
        // Constructor vacío
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("¿Como se llama la persona?");
        String nombre1 = leer.nextLine();
        System.out.println("¿Cuantos años tiene?");
        int edad1 = leer.nextInt();

        String sexo1;
        do {
            System.out.print("Ingrese el sexo (H/M/O): ");
            sexo1 = leer.nextLine().toUpperCase();
            if (!sexo1.equals("H") && !sexo1.equals("M") && !sexo1.equals("O")) {
                System.out.println("Sexo inválido. Ingrese H, M o O.");
            }
        } while (!sexo1.equals("H") && !sexo1.equals("M") && !sexo1.equals("O"));

        System.out.println("¿Cuanto pesa?");
        double peso1 = leer.nextDouble();
        System.out.println("¿Cuanto mide en CM?");
        double altura1 = leer.nextDouble();

        return new Persona(nombre1, edad1, sexo1, peso1, altura1);
    }

    public boolean mayor(Persona Persona) {
        if (Persona.getEdad()>=18) {
            System.out.println("Es mayor");
        } else {
            System.out.println("No es mayor");
        }
        
        
        return Persona.getEdad() >= 18;
    }

    public int calcularIMC(Persona Persona) {

        Double IMC = (Persona.getPeso() / ((Persona.getAltura() / 100) * (Persona.getAltura() / 100)));

        if (IMC < 20) {

            return -1; // Por debajo del peso ideal
        } else if (IMC >= 20 && IMC <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }

    }

}
