/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author user
 */
public class Alumno {

    public String nombre, apellido;
    public int dni, cantVotos;
    public Set votosRecibidos;

    public String getNombre() {
        return nombre;
    }

    public Set getVotosRecibidos() {
        return votosRecibidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void aumentarVoto() {
        this.cantVotos++;
    }

    public Alumno(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantVotos = 0;
        this.votosRecibidos = new HashSet<>();
    }

    public void votar(Set<Alumno> alumnos) {
        Set<Alumno> alumnosaVotar = new HashSet<>();
        Set<Alumno> otroAlumnos = new HashSet<>(alumnos);
        otroAlumnos.remove(this);

        while (alumnosaVotar.size() < 3) {
            Alumno alumAleatorio = obtenerAlumnoAleatorio(otroAlumnos);
            alumnosaVotar.add(alumAleatorio);

        }

        alumnosaVotar.forEach((alumno) -> {
            alumno.aumentarVoto();
        });

    }

    private Alumno obtenerAlumnoAleatorio(Set<Alumno> alumnos) {
        // Obtener un alumno aleatorio del conjunto de alumnos
        int indiceAleatorio = (int) (Math.random() * alumnos.size());
        int indiceActual = 0;

        for (Alumno alumno : alumnos) {
            if (indiceActual == indiceAleatorio) {
                return alumno;
            }

            indiceActual++;
        }

        return null;
    }

    void guardarVotoRecibido(Alumno alumnoVotante) {
        votosRecibidos.add(alumnoVotante);
    }

    public void mostarVotoRecibido() {

        votosRecibidos.forEach((alumno) -> {
            System.out.println("- " + alumno.toString());
        });

    }

}
