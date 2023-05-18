/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class servicePaises {

    private Set<Pais> paises;

    public servicePaises() {
        this.paises = new HashSet<>();
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public void mostrarPaises() {
        for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
    }

    public void mostrarPaisesOrdenados() {
        TreeSet<Pais> paisesOrdenados = new TreeSet<>(new NombrePaisComparator());
        paisesOrdenados.addAll(paises);
        System.out.println("Países ordenados alfabéticamente:");
        for (Pais pais : paisesOrdenados) {
            System.out.println(pais.getNombre());
        }
    }

    public void eliminarPais() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del país a eliminar: ");
        String nombrePais = scanner.nextLine();

        Iterator<Pais> iter = paises.iterator();
        while (iter.hasNext()) {
            Pais pais = iter.next();
            if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                iter.remove();
                System.out.println("El país " + nombrePais + " ha sido eliminado del conjunto.");
                return;
            }
        }
        System.out.println("El país " + nombrePais + " no se encuentra en el conjunto.");
    }

    public class NombrePaisComparator implements Comparator<Pais> {

        @Override
        public int compare(Pais pais1, Pais pais2) {
            return pais1.getNombre().compareTo(pais2.getNombre());
        }
    }

}
