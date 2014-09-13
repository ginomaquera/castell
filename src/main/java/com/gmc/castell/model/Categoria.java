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
import javax.persistence.Table;

/**
 *
 * @author SABADO-MANHANA
 */

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nombre")
    private String nombre;
}
