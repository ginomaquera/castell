/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmc.castell.controllers;

import com.gmc.castell.helpers.PersonaDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gmc.castell.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author SABADO-MANHANA
 */

@Controller
@RequestMapping(value = {"/", "persona", "test"})
public class PersonaController {  
    
    @Autowired
    PersonaDAO personaDAO;
    private Persona persona;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("titulo", "Hola TECSUP");
        model.addAttribute("contenido", "Bienvenidos al curso Spring Framework");            
        List<Persona> personas = personaDAO.list();
        model.addAttribute("personas", personas);        
        this.persona = new Persona();        
        model.addAttribute("persona", persona);        
        return "test/index";
    }
    
    @ResponseBody
    @RequestMapping("guardarPrograma")
    public String guardarPrograma(Model model){
        //model.
        personaDAO.save(persona);
        return "ok";
    
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }  
    
    
}
