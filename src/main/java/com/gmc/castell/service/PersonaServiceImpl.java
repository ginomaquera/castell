/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmc.castell.service;

import com.gmc.castell.helpers.PersonaDAO;
import com.gmc.castell.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author SABADO-MANHANA
 */
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    PersonaDAO personaDAO;
    
    @Override
    public List<Persona> list() {
        return personaDAO.list();
    }
    
}
