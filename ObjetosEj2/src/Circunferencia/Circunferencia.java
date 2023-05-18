/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

/**
 *
 * @author user
 */
public class Circunferencia {
  private double radio;
    
  
  
  
  
/*
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia ՄArea=〖
π*radio〗^2Յ.
e) Método perimetro(): para calcular el perímetro
ՄPerimetro=2*π*radio).
*/

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double crearCircunferencia(double radio) {

        this.radio = radio;

        return this.radio;
    }
    public double area(double area) {

        area = Math.pow((Math.PI * radio),2);

        return area;
    }
    public double perimetro(double perimetro) {

        perimetro = 2*Math.PI*this.radio;

        return perimetro;
    }
    







}
