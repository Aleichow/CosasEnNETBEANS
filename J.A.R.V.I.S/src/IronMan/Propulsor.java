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
public class Propulsor {

    public static final int INTENSIDAD_BASICA = 1;
    public static final int INTENSIDAD_NORMAL = 2;
    public static final int INTENSIDAD_INTENSIVA = 3;

    private int consumo;

    public Propulsor() {
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
