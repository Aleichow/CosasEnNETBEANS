/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiacolecciones;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class GUIACOLECCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> listado = new ArrayList();

        for (int i = 0; i < 5; i++) {
            listado.add(i);
        }

        TreeSet<String> arbol = new TreeSet();

        for (int i = 0; i < 5; i++) {
            arbol.add("tu javie");
        }

        //HashMap <Llave, valor> personas = new HashMap();
        HashMap<Integer, String> personas = new HashMap();
        for (int i = 0; i < 5; i++) {
            int x = i;
            String persona = "";

            personas.put(x, persona);
        }

        System.out.println(listado);
        listado.remove(0);
        System.out.println(arbol);
        arbol.remove("tu javie");
        System.out.println(personas);
        personas.remove(1);

        System.out.println(listado);
        System.out.println(arbol);
        System.out.println(personas);

        HashMap<Integer, String> personas2 = new HashMap();

        String p1 = "Albus";
        String p2 = "Severus";

        personas2.put(0, p1);
        personas2.put(1, p2);
        //------------------------------------ 

        ArrayList<String> bebidas = new ArrayList();

        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();

        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
            
            System.out.println(bebidas);
        }

    }
}
