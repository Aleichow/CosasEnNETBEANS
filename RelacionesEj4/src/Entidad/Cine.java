/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author user
 */
public class Cine {

    public Pelicula pelicula;
    public int precioEntrada;
    public String[][] sala;

    public Cine(Pelicula pelicula, int precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.sala = new String[8][6];

    }

    public void inicializarSala() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = " ";
            }
        }
    }

    public void agregarEspectador(Espectador espectador) {
        if (espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precioEntrada) {
            ubicarEspectador(espectador);
        } else {
            System.out.println("El espectador " + espectador.getNombre() + " no cumple con los requisitos.");
        }
    }

    private void ubicarEspectador(Espectador espectador) {
        Random random = new Random();
        int fila = random.nextInt(sala.length);
        int columna = random.nextInt(sala[0].length);

        if (sala[fila][columna].equals(" ")) {
            sala[fila][columna] = "X";
            System.out.println("El espectador " + espectador.getNombre() + " se ha ubicado en el asiento: "
                    + convertirAsiento(fila, columna));
        } else {
            System.out.println("El asiento " + convertirAsiento(fila, columna) + " está ocupado. Buscando otro asiento...");
            ubicarEspectador(espectador);
        }
    }

    private String convertirAsiento(int fila, int columna) {
        char letra = (char) ('A' + (columna));
        int numero = fila+1;
        return  String.valueOf(numero) + letra;
    }

    public void mostrarSala() {
        System.out.println("Sala de cine - Película: " + pelicula.getTitulo());
        System.out.println("-----------------------------------");

        for (int i = sala.length - 1; i >= 0; i--) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
