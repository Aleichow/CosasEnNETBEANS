/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author user
 */
public class RaicesServicio {
    
    public double getDiscriminante(Raices Raices) {
        
        double discriminante = (Math.pow(Raices.getB(), 2)) - 4 * Raices.getA() * Raices.getC();
        
        return discriminante;
        
    }
    
    public void mostrarDis(Raices Raices) {
        
        System.out.println(getDiscriminante(Raices));
        
    }
    
    public boolean tieneRaices(Raices Raices) {
        
        return getDiscriminante(Raices) >= 0;
        
    }
    
    public boolean tieneRaiz(Raices Raices) {
        
        return getDiscriminante(Raices) == 0;
        
    }
    
    public void obtenerRaices(Raices Raices) {
        
        if (tieneRaices(Raices)) {
            double x1 = (-Raices.getB() + Math.sqrt(getDiscriminante(Raices))) / (2 * Raices.getA());
            double x2 = (-Raices.getB() - Math.sqrt(getDiscriminante(Raices))) / (2 * Raices.getA());
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
            
        }
        
    }
    
    public void obtenerRaiz(Raices Raices) {
        
        if (tieneRaiz(Raices)) {
            double x = -Raices.getB() / (2 * Raices.getA());
            System.out.println("La solución es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene solución única.");
            
        }
        
    }
    
    public void calcular(Raices Raices) {
        
        if (tieneRaices(Raices)) {
            obtenerRaices(Raices);
        } else if (tieneRaiz(Raices)) {
            obtenerRaiz(Raices);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        
    }
    
}
