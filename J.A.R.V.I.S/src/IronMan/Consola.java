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
public class Consola {

    public static final int INTENSIDAD_BASICA = 1;

    private int consumo;

    public Consola() {
        this.consumo = 5;
    }

    public int usar(int intensidad, String mensaje) {
        int longitudMensaje = mensaje.length();
        return consumo * intensidad * longitudMensaje;
    }

    // Getters y Setters
    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
}
