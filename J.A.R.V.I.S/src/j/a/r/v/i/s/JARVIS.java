/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.a.r.v.i.s;

import IronMan.Armadura;

/**
 *
 * @author user
 */
public class JARVIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Armadura armadura = new Armadura("Rojo", "Amarillo");
        
        
        
        armadura.caminar(10);
        armadura.caminar(100);
        armadura.caminar(1000);
        armadura.volar(5);
        armadura.usarGuantesComoArmas(3);
        
    
        
        armadura.propulsar(8);
        armadura.escribir("¡Hola, JARVIS!");
        
      
        
        armadura.volar(10);
        armadura.correr(15);
        armadura.hablar("Tony, tienes una reunión en 5 minutos.");
        
        armadura.mostrarEstado();
    }

}
