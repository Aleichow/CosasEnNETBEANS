/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra3;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author user
 */
public class HerenciaExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Alojamiento> alojamientos = new ArrayList<>();

        // Crear instancias de hoteles y añadirlos a la lista de alojamientos
        Hotel hotel1 = new Hotel("Hotel 1", "Dirección 1", "Localidad 1", "Gerente 1", 100, 200, 5, "Gimnasio A", "Restaurante 1", 80);

        alojamientos.add(hotel1);

        Hotel hotel2 = new Hotel("Hotel 2", "Dirección 2", "Localidad 2", "Gerente 2", 150, 300, 7, "Gimnasio B", "Restaurante 2", 120);
        alojamientos.add(hotel2);

        // Crear instancias de campings y añadirlos a la lista de alojamientos
        Camping camping1 = new Camping("Camping 1", "Dirección 3", "Localidad 3", "Gerente 3", 50, 10, true);
        alojamientos.add(camping1);

        Camping camping2 = new Camping("Camping 2", "Dirección 4", "Localidad 4", "Gerente 4", 80, 15, false);
        alojamientos.add(camping2);

        // Crear instancias de residencias y añadirlos a la lista de alojamientos
        Residencia residencia1 = new Residencia("Residencia 1", "Dirección 5", "Localidad 5", "Gerente 5", 20, true, true);
        alojamientos.add(residencia1);

        Residencia residencia2 = new Residencia("Residencia 2", "Dirección 6", "Localidad 6", "Gerente 6", 30, false, false);
        alojamientos.add(residencia2);

        // Consulta: Mostrar todos los alojamientos
        System.out.println("Todos los alojamientos:");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }

        System.out.println();

        // Consulta: Mostrar todos los hoteles de más caro a más barato
        System.out.println("Hoteles de más caro a más barato:");
        List<Hotel> hoteles = filtrarHoteles(alojamientos);
        Collections.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitaciones).reversed());
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }

        System.out.println();

        // Consulta: Mostrar todos los campings con restaurante
        System.out.println("Campings con restaurante:");
        List<Camping> campings = filtrarCampings(alojamientos);
        for (Camping camping : campings) {
            System.out.println(camping);
        }

        System.out.println();

        // Consulta: Mostrar todas las residencias que tienen descuento
        System.out.println("Residencias con descuento:");
        List<Residencia> residencias = filtrarResidencias(alojamientos);
        for (Residencia residencia : residencias) {
            System.out.println(residencia);
        }
    }

    // Método para filtrar y obtener solo los hoteles de la lista de alojamientos
    private static List<Hotel> filtrarHoteles(List<Alojamiento> alojamientos) {
        List<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        return hoteles;
    }

    // Método para filtrar y obtener solo los campings de la lista de alojamientos
    private static List<Camping> filtrarCampings(List<Alojamiento> alojamientos) {
        List<Camping> campings = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                campings.add((Camping) alojamiento);
            }
        }
        return campings;
    }

    // Método para filtrar y obtener solo las residencias de la lista de alojamientos
    private static List<Residencia> filtrarResidencias(List<Alojamiento> alojamientos) {
        List<Residencia> residencias = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                residencias.add((Residencia) alojamiento);
            }
        }
        return residencias;
    }

}
