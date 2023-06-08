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
public class Generador {

    private float energia;
    
    public Generador() {
        this.energia = Float.MAX_VALUE;
     
    }

    public void consumirEnergia(int cantidad) {
        this.energia = this.energia - cantidad;
        if (energia < 0) {
            energia = 0;
        }

    }

    // Getters y Setters
    public float getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public float mostrarEstadoBateria() {

        float porcentaje = (energia / Float.MAX_VALUE) * 100.0f;
        System.out.println("Estado de la batería: " + porcentaje + "%");

        return porcentaje;
    }

}
