/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelaciones;

import Entidad.DNI;
import Entidad.Persona;

/**
 *
 * @author user
 */
public class GuiaRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        DNI d1 = new DNI("A", 41671552);
    Persona p1 = new Persona("Alejo", "Gárderes", d1);
    
    
        System.out.println(p1);
    
    
    
    
    
    
    }
    
}
