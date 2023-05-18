/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CUENTA;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class cuenta {

    Scanner leer = new Scanner(System.in);

    public String titular;
    public int saldo;

    public cuenta() {
    }

    public void establecerCuenta() {

        System.out.println("De quien es la cuenta?");
        this.titular = leer.nextLine();
        System.out.println("Cuanto tiene en su cuenta?");
        this.saldo = leer.nextInt();

    }
    public void chequearCuenta() {

        System.out.println("El titular es: " + titular + " y tiene: " + saldo + " pesos.");
    }

    public void retirarDinero() {

        System.out.println("Cuanto dinero queres retirar");

        int retiro = leer.nextInt();

        saldo = saldo - retiro;
        if (saldo < 0) {
            saldo = saldo + retiro;
            System.out.println("Tu saldo se quedaria en 0, decidimos cancelar la transacción, tu saldo es: " + saldo);

        } else {

            System.out.println("Retiraste " + retiro + " tu saldo actual es: " + saldo);

        }

    }

}
