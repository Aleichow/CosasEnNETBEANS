/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IronMan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author user
 */
public class Consola {

    public static final int INTENSIDAD_BASICA = 1;

    private int consumo;
    public boolean daniado;
    private List<double[]> enemigos;

    public Consola() {
        this.consumo = 5;
        this.daniado = false;
        enemigos = new ArrayList<>();

    }

    public int usar(int intensidad, String mensaje) {
        Random random = new Random();
        if (random.nextDouble() <= 0.3) {
            daniado = true;
            System.out.println("¡La consola ha sufrido daños!");
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
            System.out.println("¡La consola ha sido reparada y está en buen estado!");
        } else {
            System.out.println("La consola no pudo ser reparada y sigue dañada.");
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

    public void agregarEnemigo() {
        Random random = new Random();

        double x = random.nextDouble() * 100; // Coordenada X aleatoria entre 0 y 100
        double y = random.nextDouble() * 100; // Coordenada Y aleatoria entre 0 y 100
        double z = random.nextDouble() * 100; // Coordenada Z aleatoria entre 0 y 100
        boolean hostil = random.nextBoolean(); // Valor aleatorio para la hostilidad

        double resistencia = random.nextDouble() * 100; // Resistencia aleatoria entre 0 y 100

        double[] coordenadas = {x, y, z, resistencia, hostil ? 1 : 0};
        enemigos.add(coordenadas);

        if (enemigos.size() > 10) {
            System.out.println("¡Alerta! Se ha alcanzado el límite de objetos en el radar.");
        }
    }

    public void calcularDistanciaEnemigos() {
        enemigos.forEach((coordenadas) -> {
            double distancia = Math.sqrt(Math.pow(coordenadas[0], 2) + Math.pow(coordenadas[1], 2) + Math.pow(coordenadas[2], 2));
            System.out.println("Enemigo en coordenadas (" + coordenadas[0] + ", " + coordenadas[1] + ", " + coordenadas[2] + ")");
            System.out.println("Distancia: " + distancia);
        });
    }

}
