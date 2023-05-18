/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos;

/**
 *
 * @author user
 */
public class puntos {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double distancia;

    public puntos() {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void crearPuntos(int x1, int x2, int y1, int y2) {

        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }

    public puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calcularDistancia(){
    distancia= Math.sqrt((x1-x2)^2+(y1-y2)^2);
    return distancia;
    }

    public void calcularDistancia2(){
    
        System.out.println(Math.sqrt((x1-x2)^2+(y1-y2)^2));
        
   
    }
    
    
    
}
