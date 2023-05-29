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
public class aMotor extends Barco {
    private int potenciaCV;

    public aMotor(String matricula, double eslora, int fabricacion, int potenciaCV) {
        super(matricula, eslora, fabricacion);
        this.potenciaCV = potenciaCV;
    }

    

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
}