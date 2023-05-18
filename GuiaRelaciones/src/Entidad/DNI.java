/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


public class DNI {

    public String letra;
    
    public int num;

    public DNI() {
    }

    public DNI(String letra, int num) {
        this.letra = letra;
        this.num = num;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "DNI{" + "letra=" + letra + ", num=" + num + '}';
    }
    
    
    
    
}
