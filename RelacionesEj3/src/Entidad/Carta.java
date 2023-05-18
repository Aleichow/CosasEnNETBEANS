/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class Carta {

    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
