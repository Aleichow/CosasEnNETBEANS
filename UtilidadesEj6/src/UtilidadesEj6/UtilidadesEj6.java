/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilidadesEj6;

import Entidad.Curso;
import Servicios.CursoServicio;
import java.text.ParseException;

/**
 *
 * @author user
 */
public class UtilidadesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CursoServicio c1s = new CursoServicio();
        
        Curso c1 = c1s.crearCurso();
        c1s.calcularGanancias(c1);
    }
    
}
