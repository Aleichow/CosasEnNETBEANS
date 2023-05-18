/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class extracuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int [] vec = new int [11];
    int notapt,notast,notapi,notasi,ap,des;
    ap=0;
    des=0;
        for (int i = 1; i < (vec.length); i++) {
            System.out.println("Cual es la nota del PT del alumno " + i);
            notapt = leer.nextInt();
                        System.out.println("Cual es la nota del ST del alumno " + i);
            notast = leer.nextInt();
                        System.out.println("Cual es la nota del PI del alumno " + i);
            notapi = leer.nextInt();
                        System.out.println("Cual es la nota del SI del alumno " + i);
            notasi = leer.nextInt();
            vec[i]= (int) (primerTrabajo(notapt)+segundoTrabajo(notast)+primerInt(notapi)+segundoInt(notasi));
        
            System.out.println("El promedio final de este alumno es "+vec[i]);
        
            if (vec[i]>=7) {
                ap++;
            } else {
                des++;
            }
            
        }
    
        System.out.println("Hubo " + ap + " alumnos aprobado/s y "+des+ ""
                + " desaprobado/s");
    
    }
    
    
    public static double primerTrabajo(int notapt){
    
        double primt=notapt*0.10;
        
        
        
        return primt;
    }
    
    public static double segundoTrabajo(int notast){
    
        double segt=notast*0.15;
        
        
        
        return segt;
    }
    public static double primerInt(int notapi){
    
        double primint=notapi*0.25;
        
        
        
        return primint;
    }
     public static double segundoInt(int notasi){
    
        double segInt=notasi*0.50;
        
        
        
        return segInt;
    }
    
}
