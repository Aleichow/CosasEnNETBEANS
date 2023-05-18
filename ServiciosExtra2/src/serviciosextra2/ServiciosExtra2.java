/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra2;

import Entidad.NFI;
import Servicios.NFIServicios;

/**
 *
 * @author user
 */
public class ServiciosExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NFIServicios n1s = new NFIServicios();
        
        NFI n1 = n1s.crearNFI();
        n1s.mostrarNFI(n1);
        
    }
    
}
