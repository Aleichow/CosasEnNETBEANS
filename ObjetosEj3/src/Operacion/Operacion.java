/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

/**
 *
 * @author user
 */
public class Operacion {

    private int n1, n2, suma, resta;
    private double multi, divi;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operacion() {
    }

    
    public void crearOperacion(int n1, int n2) {

        this.n1 = n1;
        this.n2 = n2;

    }

    public int sumar() {
        suma = n1 + n2;

        return suma;
    }

    public int restar() {
        resta = n1 - n2;

        return resta;
    }

    public double multiplicar() {

        if (n1 == 0 || n2 == 0) {
            System.out.println("Se esta haciendo una multiplicacion por 0");
            return 0;
        } else {
            multi = n1 * n2;

            return multi;

        }

    }
    public double dividir() {

        if (n1 == 0 || n2 == 0) {
            System.out.println("Se esta haciendo una división por 0");
            return 0;
        } else {
            divi = n1 / n2;

            return divi;

        }

    }



}
