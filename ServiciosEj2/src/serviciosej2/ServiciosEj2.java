/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosej2;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author user
 */
public class ServiciosEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CafeteraServicio c1s = new CafeteraServicio();
        
        Cafetera c1 = new Cafetera();        
        
        c1s.llenarCafetera(c1);
        c1s.vaciarCafetera(c1);
        c1s.agregarCafe(c1);
        c1s.servirTaza(c1);
    }
    
}
