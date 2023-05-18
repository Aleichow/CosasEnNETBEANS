/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra1;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author user
 */
public class ServiciosExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        RaicesServicio r1s = new RaicesServicio();
        Raices r1 = new Raices(1, -5, 6);

        r1s.getDiscriminante(r1);
        r1s.tieneRaices(r1);
        r1s.tieneRaiz(r1);
        r1s.obtenerRaices(r1);
        r1s.obtenerRaiz(r1);
        r1s.calcular(r1);

    }

}
