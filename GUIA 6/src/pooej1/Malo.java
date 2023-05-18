/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import entidad.Persona;
import entidadService.personaService;

/**
 *
 * @author user
 */
public class Malo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        personaService p1s = new personaService();

        Persona p1 = p1s.crearPersona();

        System.out.println(p1.toString());

    }

}
