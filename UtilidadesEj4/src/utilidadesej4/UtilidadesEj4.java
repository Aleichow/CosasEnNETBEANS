/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej4;

import Servicio.DateServicio;
import java.util.Date;

/**
 *
 * @author user
 */
public class UtilidadesEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DateServicio a1 = new DateServicio();

        System.out.println(a1.diferencia(a1.fechaNacimiento(), a1.fechaActual()));

    }

}
