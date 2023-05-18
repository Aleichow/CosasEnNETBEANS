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
public class extrauno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer2 = new Scanner(System.in);

        System.out.println("De que tamaño es el vector: ");
        int vec=leer2.nextInt();
    int[] m = new int [vec];
		
        llenarVector(m,vec);
        
        int suma= sumaVector(m);
        System.out.println("La sumatoria de todos los numeros del vector es igual a: " + suma);
    
        
    
    
    
    
    
    
    
    
    }
public static void llenarVector (int[] m, int vec){
  Scanner leer = new Scanner(System.in);
    System.out.println("Dame " + vec+" numeros." );
for (int i = 0; i < m.length ; i++) {
                m[i]=leer.nextInt();
            }
}

public static int sumaVector(int []m){
int a=0;
    for (int i = 0; i < m.length; i++) {
        
        a=a+m[i];
    }


return a;

}



}





