/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceCuentaBancaria;

import cuentaBancaria.cuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class serviceCuentaBancaria {

    private Scanner sc = new Scanner(System.in);

    public cuentaBancaria crearCuenta() {
        cuentaBancaria cuentaBancaria = new cuentaBancaria();
        System.out.print("Ingrese el número de cuenta: ");
        cuentaBancaria.setNrocuenta(sc.nextInt());
        System.out.print("Ingrese el DNI del cliente: ");
        cuentaBancaria.setDnicliente(sc.nextLong());
        System.out.print("Ingrese el saldo actual: ");
        cuentaBancaria.setSaldocuenta(sc.nextDouble());
        return cuentaBancaria;
    }

    public void ingresar(cuentaBancaria cuentaBancaria) {
        System.out.println("Decime cuanto queres ingresar en la cuenta");
        cuentaBancaria.setSaldocuenta(cuentaBancaria.getSaldocuenta() + sc.nextDouble());
        System.out.println("El saldo actual es: " + cuentaBancaria.getSaldocuenta());

    }

    public void retirar(cuentaBancaria cuentaBancaria) {

        System.out.println("Cuanta plata queres retirar");

        double retiro = sc.nextDouble();

        if (retiro > cuentaBancaria.getSaldocuenta()) {
            System.out.println("El pedido de retiro es mas grande que el saldo se retirara lo maximo posible hasta dejar la cuenta en 0: " + cuentaBancaria.getSaldocuenta());
            cuentaBancaria.setSaldocuenta(0);
            System.out.println("El saldo actual es: " + cuentaBancaria.getSaldocuenta());
        } else {
            cuentaBancaria.setSaldocuenta(cuentaBancaria.getSaldocuenta() - retiro);
            System.out.println("El saldo actual es: " + cuentaBancaria.getSaldocuenta());
        }
    }

    public void retiroRapido(cuentaBancaria cuentaBancaria) {

        double retiro = (cuentaBancaria.getSaldocuenta() * 0.2);
        System.out.println("Se retirara: " + retiro);
        cuentaBancaria.setSaldocuenta(cuentaBancaria.getSaldocuenta() - retiro);
        System.out.println("El saldo actual es: " + cuentaBancaria.getSaldocuenta());
    }

    public void consultarSaldo(cuentaBancaria cuentaBancaria) {

        System.out.println("Tu saldo es: " + cuentaBancaria.getSaldocuenta());

    }

    public void consultarCuenta(cuentaBancaria cuentaBancaria) {

        System.out.println(cuentaBancaria.toString());
    }

}
