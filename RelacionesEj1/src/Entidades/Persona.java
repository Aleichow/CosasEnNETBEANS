/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author user
 */
public class Persona {

    public String nombre, apellido;
    public int edad, dni;
    public Perro perro;

    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void adoptarPerro(Perro perro) {
        this.perro = perro;
    }

    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + dni);
        if (this.perro == null) {
            System.out.println("Esta persona no tiene perro");
        } else {
   System.out.println("Información del perro adoptado:");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Tamaño: " + perro.getTamano());
     
        
        }
        
    }

}
