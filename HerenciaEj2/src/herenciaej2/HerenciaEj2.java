/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej2;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author user
 */
public class HerenciaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       // Lavadora lavadora = new Lavadora();
        Televisor tele = new Televisor();

       // lavadora.crearLavadora();
       // lavadora.precioFinal(lavadora.getConsumoEnergetico(), lavadora.getPeso());
       // System.out.println(lavadora.toString());

        tele.crearTelevisor();
        tele.precioFinal(tele.getConsumoEnergetico(), tele.getPeso());
        System.out.println(tele.toString());
        
        
        
    }

}
