/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COCINA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class RECETAS {

    Scanner leer = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    public void agregarRecetas() {

        list.add(leer.nextLine());
    }

    public void leerRecetas() {

        for (String recetas : list) {
            System.out.println(recetas);
        }
    }
    public String devolverRecetas(String pedido) {

        System.out.println("¿Que receta queres?");
        pedido = leer.nextLine();
        
        System.out.println(list.get(0));
        
        return pedido;
    }

}
