/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class servicePeliculas {

    Scanner sc = new Scanner(System.in);
    ArrayList<Peliculas> listP = new ArrayList<>();

    public Peliculas crearAlum() {

        System.out.println("Cual es el nombre de esta pelicula: ");
        String Titulo = sc.nextLine();
        sc.nextLine();
        System.out.println("Quien la dirigio: ");
        String Director = sc.nextLine();
        System.out.println("Cuantas horas dura: ");
        Double horas = sc.nextDouble();

        Peliculas pelis = new Peliculas(Titulo, Director, horas);

        listP.add(pelis);

        return pelis;

    }

    public void mostrarPelis() {

        System.out.println("Estas son las peliculas actuales: ");

        System.out.println(listP.toString());

    }

    public void mostrarPeliculasMasDe1Hora() {
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Peliculas pelicula : listP) {
            if (pelicula.getHoras() > 1) {
                System.out.println(pelicula.getTitulo() + ", dirigida por " + pelicula.getDirector() + ", duración: " + pelicula.getHoras() + " horas.");
            }
        }
    }

    public void mayoramenor() {

        listP.sort(mayoramenor);
        System.out.println(listP.toString());
    }

    public void menoramayor() {

        listP.sort(menoramayor);
        System.out.println(listP.toString());
    }

    public void porTitulo() {

        Collections.sort(listP, Comparator.comparing(Peliculas::getTitulo));

        System.out.println(listP.toString());

    }

    public void porDirector() {

        Collections.sort(listP, Comparator.comparing(Peliculas::getDirector));

        System.out.println(listP.toString());

    }

    public static Comparator<Peliculas> mayoramenor = new Comparator<Peliculas>() {

        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            if (p1.getHoras() < p2.getHoras()) {
                return 1;
            } else if (p1.getHoras() > p2.getHoras()) {
                return -1;
            } else {
                return 0;
            }
        }

    };
    public static Comparator<Peliculas> menoramayor = new Comparator<Peliculas>() {

        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            if (p1.getHoras() > p2.getHoras()) {
                return 1;
            } else if (p1.getHoras() < p2.getHoras()) {
                return -1;
            } else {
                return 0;
            }
        }

    };

}
