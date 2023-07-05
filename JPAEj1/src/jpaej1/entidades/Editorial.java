/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaej1.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author user
 */
@Entity
public class Editorial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Boolean alta;

    public Editorial() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Editorial(String nombre) {
        this.nombre = nombre;
        this.alta = true;

    }

    // Constructor, getters y setters
}
