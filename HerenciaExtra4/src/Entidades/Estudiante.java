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
public class Estudiante extends Persona {

    private String curso;

    public Estudiante(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, String curso) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.curso = curso;
    }

    // Getters y setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Métodos adicionales
    public void matricularEnCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
}
