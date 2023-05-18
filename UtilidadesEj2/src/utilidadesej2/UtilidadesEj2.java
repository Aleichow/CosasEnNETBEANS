/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej2;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

/**
 *
 * @author user
 */
public class UtilidadesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParDeNumeros n1 = new ParDeNumeros();
        ParDeNumerosServicio n1s = new ParDeNumerosServicio();

        n1s.mostrarValores(n1);
        System.out.println(n1s.mayor(n1));
        System.out.println(n1s.potencia(n1));
        System.out.println(n1s.raiz(n1));

    }

}
