/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import static extra2.extrauno.llenarVector;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class extrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner leer2 = new Scanner(System.in);

        System.out.println("De que tamaño son los vectores: ");
        int vec=leer2.nextInt();
     
    int[] m = new int [vec];
    int[] m2 = new int [vec];
		
        llenarVector(m,vec);
        llenarVector2(m2,vec);
        
        if (compararVectores(m, m2)) {
            System.out.println("Los vectores son iguales");
        }else {
            System.out.println("Los vectores no son iguales");
        }
    }
    
    public static void llenarVector2 (int[] m2, int vec){
  Scanner leer3 = new Scanner(System.in);
    System.out.println("Dame " + vec+" numeros." );
for (int i = 0; i < m2.length ; i++) {
                m2[i]=leer3.nextInt();
            }
}

   
    public static boolean compararVectores (int []m,int []m2){
    boolean comp=false;
    int c =0;
    
        for (int i = 0; i < m.length ; i++) {
            if (m[i]==m2[i]) { 
                c++;
            }else{
                System.out.println("Se corta");
            break;
            }
            System.out.println(c);
            
        }
    
        if (c==m.length) {
            comp=true;
        }
    
    
    
    
    
    return comp;
    }
    
    
    
    
    
    
}
