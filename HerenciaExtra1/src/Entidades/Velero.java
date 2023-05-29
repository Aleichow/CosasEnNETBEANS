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
public class Velero extends Barco {
    private int numeroMastiles;

    public Velero(String matricula, double eslora, int fabricacion, int numeroMastiles) {
        super(matricula, eslora, fabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }
}
