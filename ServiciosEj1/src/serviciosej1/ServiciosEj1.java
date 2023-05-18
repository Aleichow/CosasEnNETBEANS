/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosej1;

import cuentaBancaria.cuentaBancaria;
import serviceCuentaBancaria.serviceCuentaBancaria;

/**
 *
 * @author user
 */
public class ServiciosEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        serviceCuentaBancaria c1s = new serviceCuentaBancaria();

        cuentaBancaria c1 = c1s.crearCuenta();

        c1s.ingresar(c1);
        c1s.consultarSaldo(c1);
        c1s.retirar(c1);
        c1s.retiroRapido(c1);
        c1s.consultarCuenta(c1);

    }

}
