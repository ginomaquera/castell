/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmc.castell.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author SABADO-MANHANA
 */

@Entity
@Table(name = "vendedor")
public class Vendedor implements  Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;      
    
    @Column(name = "estado")
    private String estado;   
    
    @OneToOne
    @JoinColumn(name="id_persona")
    private Persona persona;

    public Vendedor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
