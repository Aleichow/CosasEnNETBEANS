/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.entidades;

import java.sql.Date;

/**
 *
 * @author user
 */
public class Comentarios {
     private int idComentario;
    private int idCasa;
   
    private String comentario;
    
    // Constructor sin argumentos
    public Comentarios() {
    }
    
    // Constructor con todos los argumentos
    public Comentarios(int idComentario, int idCasa, String comentario) {
        this.idComentario = idComentario;
        this.idCasa = idCasa;
     
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "idComentario=" + idComentario + ", idCasa=" + idCasa +  ", comentario=" + comentario + '}';
    }
    
    // Getter y Setter para idComentario
    public int getIdComentario() {
        return idComentario;
    }
    
    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }
    
    // Getter y Setter para idCasa
    public int getIdCasa() {
        return idCasa;
    }
    
    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    
  
    
    // Getter y Setter para comentario
    public String getComentario() {
        return comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
