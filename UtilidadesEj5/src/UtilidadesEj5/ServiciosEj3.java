/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilidadesEj5;

import Entidad.Persona;
import Servicios.PersonaServicio;
import java.text.ParseException;

/**
 *
 * @author user
 */
public class ServiciosEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        PersonaServicio p1s = new PersonaServicio();

        Persona p1 = p1s.crearPersona();

        p1s.mostrarPersona(p1);

        System.out.println("Es menor a 18 años?");
        

        System.out.println(p1s.menorQue(p1, 18));
    }

}
