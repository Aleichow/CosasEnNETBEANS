/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aumento;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class sueldo {

    Scanner leer = new Scanner(System.in);
    public int sueldo, edad;
    public String nombre;

    public sueldo() {
    }

    public void crearEmpleado() {

        System.out.println("¿Como se llama el empleado?");
        this.nombre = leer.nextLine();
        System.out.println("¿Cuantos años tiene?");
        this.edad = leer.nextInt();
        System.out.println("¿Cual es su sueldo?");
        this.sueldo = leer.nextInt();

    }

    public void calcularAumento() {

        if (edad < 30) {

            System.out.println("El aumento es del 5%");
            System.out.println("Su sueldo actual es: " + sueldo);
            System.out.println("Con el aumento es: " + (sueldo + (sueldo * 0.05)));
        } else {
            System.out.println("El aumento es del 10%");
            System.out.println("Su sueldo actual es: " + sueldo);
            System.out.println("Con el aumento es: " + (sueldo + (sueldo * 0.10)));
        }

    }

}
