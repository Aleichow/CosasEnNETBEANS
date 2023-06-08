/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IronMan;

import java.util.Random;

/**
 *
 * @author user
 */
public class Sintetizador {

    public static final int INTENSIDAD_BASICA = 1;

    private int consumo;
    public boolean daniado;

    public Sintetizador() {
        this.consumo = 3;
        this.daniado = false;
    }

    public int usar(int intensidad, String mensaje) {
        Random random = new Random();
        if (random.nextDouble() <= 0.3) {
            daniado = true;
            System.out.println("¡El sintetizador ha sufrido daños!");
            return 0;
        }

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

    public void reparar() {
        Random random = new Random();
        if (random.nextDouble() <= 0.4) {
            daniado = false;
            System.out.println("¡El sintetizador ha sido reparado y está en buen estado!");
        } else {
            System.out.println("El sintetizador no pudo ser reparado y sigue dañado.");
        }
    }

    public boolean estaDestruido() {
        // Agrega aquí la lógica para determinar si el propulsor está destruido
        // Puedes utilizar la clase Random para modelar la probabilidad de destrucción
        // y retornar true si el propulsor se destruye, y false en caso contrario.
        // Por ejemplo:
        Random random = new Random();
        double probabilidadDestruccion = 0.3; // 30% de probabilidad de destrucción
        return random.nextDouble() <= probabilidadDestruccion;
    }

    public boolean estaReparado() {
        return !daniado && !estaDestruido();
    }
}
