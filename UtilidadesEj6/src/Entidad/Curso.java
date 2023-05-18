/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author user
 */
public class Curso {

    public String nombreCurso, turno;
    public int cantHorasxDia, cantDiasxSemana;
    public double precioxhora;
    public String[] alumnos;

    public Curso() {
        this.alumnos = new String[5];
    }

    public Curso(String nombreCurso, String turno, int cantHorasxDia, int cantDiasxSemana, double precioxhora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantHorasxDia = cantHorasxDia;
        this.cantDiasxSemana = cantDiasxSemana;
        this.precioxhora = precioxhora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantHorasxDia() {
        return cantHorasxDia;
    }

    public void setCantHorasxDia(int cantHorasxDia) {
        this.cantHorasxDia = cantHorasxDia;
    }

    public int getCantDiasxSemana() {
        return cantDiasxSemana;
    }

    public void setCantDiasxSemana(int cantDiasxSemana) {
        this.cantDiasxSemana = cantDiasxSemana;
    }

    public double getPrecioxhora() {
        return precioxhora;
    }

    public void setPrecioxhora(double precioxhora) {
        this.precioxhora = precioxhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}
