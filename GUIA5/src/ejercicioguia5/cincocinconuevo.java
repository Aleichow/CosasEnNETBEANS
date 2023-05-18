/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class cincocinconuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Matriz original
        Scanner leer = new Scanner(System.in);
    
    
    int[][] m = new int [3][3];
		
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j]=leer.nextInt();
                        
                }
            }
        
        
//La transponemos
        comprobar(m);
    
    }
    
  public static void comprobar (int[][]m){
    boolean comp= false;
    
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j]== -m [j][i]) {
                    comp=true;
                }else {comp=false;
                        
                }
            }
        }
    
    if (comp) {
                    System.out.println("La matriz es antisimetrica");
                } else {
                    System.out.println("La matriz es antisimetrica");
                }
    }
    

    }
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    

