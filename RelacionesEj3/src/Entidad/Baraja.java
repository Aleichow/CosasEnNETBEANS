/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class Baraja {

    private List<Carta> cartas;
    private List<Carta> cartasMonton;

    public Baraja() {
        cartas = new ArrayList<>();
        cartasMonton = new ArrayList<>();
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String palo : palos) {
            for (int numero : numeros) {
                Carta carta = new Carta(palo, numero);
                cartas.add(carta);
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
            System.out.println("No quedan más cartas en la baraja.");
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

   public List<Carta> darCartas(int cantidad) {
        List<Carta> cartasDadas = new ArrayList<>();

        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return cartasDadas;
        }

        for (int i = 0; i < cantidad; i++) {
            Carta carta = cartas.remove(0);
            cartasMonton.add(carta);
            cartasDadas.add(carta);
        }

        return cartasDadas;
    }

    public List<Carta> cartasMonton() {
        return cartasMonton;
    }

    public void mostrarBaraja() {
        cartas.forEach((carta) -> {
            System.out.println(carta);
        });
    }

}
