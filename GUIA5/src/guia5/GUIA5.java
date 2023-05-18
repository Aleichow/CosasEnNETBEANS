/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author user
 */
public class GUIA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Creo un arreglo llamado vector con dimensión 5 que
// solo pueda alojar números enteros
int[] vector = new int[5];
// Creo una matriz con dimensión 3x3 que
// solo pueda alojar cadenas
String[][] matriz = new String[3][3];
    
    int vec[] = new int[5]; // Le ponemos la dimension al vector
// Puedo asignar valores de esta manera vector[0] = 3;
// Asigno valores mediante el for
for (int i = 0; i < 5; i++) { vector[i] = i + 3;
}
// Muestro el vector
for (int i = 0; i < 5; i++) {
System.out.println("[" + vector[i] + "]");
}
    

    }
    
}
