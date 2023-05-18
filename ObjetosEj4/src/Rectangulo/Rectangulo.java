/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

/**
 *
 * @author user
 */
public class Rectangulo {

    private int altura, base;
    private double area, perimetro;
    private String dibujo;
    private String[][] rec;

    public Rectangulo() {
    }

    public Rectangulo(int altura, int base, double area, double perimetro, String dibujo, String[][] rec) {
        this.altura = altura;
        this.base = base;
        this.area = area;
        this.perimetro = perimetro;
        this.dibujo = dibujo;
        this.rec = rec;
    }

    public String[][] getRec() {
        return rec;
    }

    public void setRec(String[][] rec) {
        this.rec = rec;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getDibujo() {
        return dibujo;
    }

    public void setDibujo(String dibujo) {
        this.dibujo = dibujo;
    }

    public void crearRectangulo(int n1, int n2) {

        altura = n1;
        base = n2;
    }

    public double calcularArea() {

        area = base * altura;

        return area;
    }

    public double calcularPerimetro() {

        perimetro = (base + altura) * 2;

        return perimetro;
    }
    

    public void imprimirRectangulo(){
    
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    
    
    }
   


   





}
