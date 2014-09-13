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
@Table(name = "usuario")
public class Usuario implements  Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id; 
    
    @Column(name = "username")
    private String username;   
    
    @Column(name = "password")
    private String password;   
    
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "rol")
    private String rol; 
    
    @OneToOne
    @JoinColumn(name="id_persona")
    private Persona persona;

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }  

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }  
    
    
    
}
