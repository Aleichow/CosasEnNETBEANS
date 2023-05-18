/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosej3;

import Entidad.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author user
 */
public class ServiciosEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Boolean[] mayoredad = new Boolean[4];
        int[] pesoideal = new int[4];

        PersonaServicio p1s = new PersonaServicio();
        PersonaServicio p2s = new PersonaServicio();
        PersonaServicio p3s = new PersonaServicio();
        PersonaServicio p4s = new PersonaServicio();
        Persona p1 = p1s.crearPersona();

        if (p1s.mayor(p1)) {
            System.out.println("Es mayor de edad");
        } else {

            System.out.println("Es menor de edad");
        }
        p1s.calcularIMC(p1);

        Persona p2 = p2s.crearPersona();
        if (p2s.mayor(p2)) {
            System.out.println("Es mayor de edad");
        } else {

            System.out.println("Es menor de edad");
        }
        p2s.calcularIMC(p2);
        Persona p3 = p3s.crearPersona();
        if (p3s.mayor(p3)) {
            System.out.println("Es mayor de edad");
        } else {

            System.out.println("Es menor de edad");
        }
        p3s.calcularIMC(p3);

        Persona p4 = p4s.crearPersona();
        if (p4s.mayor(p4)) {
            System.out.println("Es mayor de edad");
        } else {

            System.out.println("Es menor de edad");
        }
        p4s.calcularIMC(p4);

        int[] resultadosIMC = new int[4];
        boolean[] resultadosMayorEdad = new boolean[4];

        resultadosIMC[0] = p1s.calcularIMC(p1);
        resultadosIMC[1] = p2s.calcularIMC(p2);
        resultadosIMC[2] = p3s.calcularIMC(p3);
        resultadosIMC[3] = p4s.calcularIMC(p4);

        resultadosMayorEdad[0] = p1s.mayor(p1);
        resultadosMayorEdad[1] = p2s.mayor(p2);
        resultadosMayorEdad[2] = p3s.mayor(p3);
        resultadosMayorEdad[3] = p4s.mayor(p4);

        // Calcular porcentaje de personas por debajo, en su peso ideal o por encima
        int pesoIdeal = 0;
        int sobrepeso = 0;
        int debajoPeso = 0;

        for (int i = 0; i < resultadosIMC.length; i++) {
            if (resultadosIMC[i] == 0) {
                pesoIdeal++;
            } else if (resultadosIMC[i] == 1) {
                sobrepeso++;
            } else {
                debajoPeso++;
            }
        }

        double porcentajePesoIdeal = (double) pesoIdeal / resultadosIMC.length * 100;
        double porcentajeSobrepeso = (double) sobrepeso / resultadosIMC.length * 100;
        double porcentajeDebajoPeso = (double) debajoPeso / resultadosIMC.length * 100;

        System.out.println("% PESO IDEAL: " + porcentajePesoIdeal + "| % SOBREPESO: " + porcentajeSobrepeso + "| % DEBAJOPESO: " + porcentajeDebajoPeso);

        // Calcular porcentaje de personas mayores y menores de edad
        int mayoresEdad = 0;
        int menoresEdad = 0;

        for (int i = 0; i < resultadosMayorEdad.length; i++) {
            if (resultadosMayorEdad[i]) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
        }

        double porcentajeMayoresEdad = (double) mayoresEdad / resultadosMayorEdad.length * 100;
        double porcentajeMenoresEdad = (double) menoresEdad / resultadosMayorEdad.length * 100;

        System.out.println("% MAYOR EDAD: " + porcentajeMayoresEdad + "| % MENORES: " + porcentajeMenoresEdad);

    }

}
