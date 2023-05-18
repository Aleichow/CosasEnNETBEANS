/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.NFI;
import java.util.Scanner;
import org.omg.CORBA.DynFixed;

/**
 *
 * @author user
 */
public class NFIServicios {

    Scanner leer = new Scanner(System.in);

    public NFI crearNFI() {

        System.out.println("Dame el DNI de la persona: ");

        long DNI = leer.nextLong();

        String letra = elegirLetra(DNI);

        return new NFI(DNI, letra);
    }

    public String elegirLetra(long DNI) {

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int busqueda = (int) (DNI% 23);

        return letras[busqueda];
    }

    public void mostrarNFI(NFI nfi) {

        System.out.println("El NFI es " + nfi.getDNI() + "-" + nfi.getLetra());

    }

}
