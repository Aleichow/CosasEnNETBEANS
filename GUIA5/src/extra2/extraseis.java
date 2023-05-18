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
public class extraseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
    String [][] mat = new String [20][20];
    String pal;
    int c=0;
        do {
            System.out.println("Dame una palabra de entre 3 y 5 caracteres");   
            do {                
                  pal=leer.nextLine();
                  if (pal.length()<3 || pal.length()>5) {
                      System.out.println("Dije entre 3 y 5 caracteres");
                }
            } while (pal.length()<3 || pal.length()>5); 
            
         c++;
        int lugara =0;
        int lugarb =0;
         lugara = (int)(Math.random()*20);
         lugarb = (int)(Math.random()*15);
            System.out.println(lugara);
            
            for (int j = 0; j < pal.length(); j++) {
                
                    mat[lugara][lugarb+j] = pal.substring(j, j+1);
        }
        } while (c<5);
        rellenarVacios(mat);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    
    }
    
public static void rellenarVacios (String [][]mat){

    for (int i = 0; i < 20; i++) {
    for (int j = 0; j < 20; j++) {
        if (mat[i][j]==null) {
            mat[i][j]= Integer.toString((int) (Math.random() * 10));
        }
    }
    }
}

}
