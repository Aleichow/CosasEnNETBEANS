/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IronMan;

/**
 *
 * @author user
 */
public class Repulsor {

    public static final int INTENSIDAD_BASICA = 1;
    public static final int INTENSIDAD_NORMAL = 2;

    private int consumo;

    public Repulsor() {
        this.consumo = 3;
    }

    public int usar(int intensidad, int tiempo) {
        return consumo * intensidad * tiempo;
    }

    // Getters y Setters
    public int getConsumo() {
        return this.consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
}
