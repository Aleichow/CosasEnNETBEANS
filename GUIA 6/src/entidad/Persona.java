/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author user
 */
public class Persona {

    private String nombre;
    private String apodo;
    private int edad;
    private int energia;
    private double altura;

    public Persona(int energia) {//por defecto para cualquier persona
        energia = 1000;
    }

    public Persona(String nombre, String apodo, int edad, double altura) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.altura = altura;
        energia = 1000;//esto hace que vos no la tengas que definir de antemano ni setear ni nada

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int cansancio(int energiaRestar) {

        energia -= energiaRestar;
        return energia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + ", energia=" + energia + ", altura=" + altura + '}';
    }

}
