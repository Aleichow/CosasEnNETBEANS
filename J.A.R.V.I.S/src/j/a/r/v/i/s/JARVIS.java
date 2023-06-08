/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.a.r.v.i.s;

import IronMan.Armadura;

/**
 *
 * @author user
 */
public class JARVIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Armadura armadura = new Armadura("Rojo", "Dorado");

        armadura.mostrarEstado();

        armadura.caminar(10);
        armadura.volar(5);
        armadura.disparar(3);

        armadura.mostrarEstado();

        armadura.revisarDispositivos();

        armadura.mostrarEstado();

        armadura.agregarEnemigo();

        armadura.calcularDistanciaEnemigos();
    }
}
