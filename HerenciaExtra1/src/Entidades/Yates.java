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
public class Yates extends Barco {

    private int potenciaCV;
    private int numeroCamarotes;

    public Yates(String matricula, double eslora, int fabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, fabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numeroCamarotes;
    }
}
