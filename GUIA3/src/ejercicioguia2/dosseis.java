/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class dosseis {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
     
        
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
       String sino= "N";
        int salida = 1;
        System.out.println("Dame dos numeros: ");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        while (sino.equals("N")) {            
            
      
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            System.out.println("Elija opción: ");
            
        int num = leer.nextInt();
            switch(num){
                case 1:
                    System.out.println("Elegiste sumar");
                    System.out.println("La suma de los dos numeros es " + (n1+n2));
              break;
                case 2:
                   System.out.println("Elegiste restar");
                    System.out.println("La resta de los dos numeros es " + (n1-n2));
break;
                case 3:
                   System.out.println("Elegiste multiplicar");
                    System.out.println("La multiplicación de los dos numeros es " + (n1*n2));
              break;
                case 4:
                   System.out.println("Elegiste dividir");
                    System.out.println("La division de los dos numeros es " + (n1/n2));
              break;
                
                case 5:
                    
                    System.out.println("Elegiste salir");
                    System.out.println("Estas seguro que queres salir (S/N):");

                    sino = leer2.nextLine();
                    sino = sino.toUpperCase();
                   
                    
           break;
                        
                    }//hasta aca el switch
               
        
        
        
        }      //hasta aca va el while
    
    
    
    }





}




  
    