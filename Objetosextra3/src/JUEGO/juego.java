/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUEGO;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class juego {

    Scanner leer = new Scanner(System.in);

    int contador, adivinar, intentos, gana1, gana2, tries, c2;

    String Seguir;

    public juego() {
        this.intentos = 3;
    }

    public juego(int contador, int adivinar, int gana1, int gana2, int tries, int c2, String Seguir) {
        this.contador = contador;
        this.adivinar = adivinar;
        this.gana1 = gana1;
        this.gana2 = gana2;
        this.tries = tries;
        this.c2 = c2;
        this.Seguir = Seguir;
        this.intentos = 3;
    }

    public void comenzarJuego() {

        System.out.println("Jugador 1 elegi un numero: ");
        this.contador = leer.nextInt();
c2=0;
        for (int i = 0; i < this.intentos; i++) {
c2++;
      
            System.out.println("Jugador 2 dame un numero");
            this.adivinar = leer.nextInt();
      if (adivinar < contador) {
                System.out.println("Tu numero es mas chico");
                tries++;
            } else if (adivinar > contador) {
                System.out.println("Tu numero es mas grande");
                tries++;
            } else {
                System.out.println("Lo adivinaste");
           
                gana2++;
                break;

            }
            if (c2==3) {
                System.out.println("No pudiste adivinar dentro de los intentos.");
                gana1++;
            }
            
        
        }

      

    }

    @Override
    public String toString() {
        return "juego{" + "El jugador 1 gano: " + gana1 + ", El jugador 2 gano: " + gana2 + ", La cantidad total de intentos fueron:" + tries + '}';
    }

}
