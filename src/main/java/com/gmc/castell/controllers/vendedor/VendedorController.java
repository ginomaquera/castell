/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmc.castell.controllers.vendedor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author SABADO-MANHANA
 */

@Controller
@RequestMapping("/admin/vendedor")
public class VendedorController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        return "admin/vendedor/index";
    }
    
}
