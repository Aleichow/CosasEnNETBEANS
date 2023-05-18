/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej3;


import Servicio.ArreglosServicio;

/**
 *
 * @author user
 */
public class UtilidadesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        double [] a1 = new double [50];
        double [] b1 = new double [20];

        ArreglosServicio as = new ArreglosServicio();
        
      as.inicializarA(a1);
      as.mostrar(a1);
      as.sortA(a1);
      as.inicializarB(a1,b1);
      as.mostrar(a1);
      as.mostrar(b1);
    }

}
