/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.controler;

import com.tienda.tienda.entity.Paises;
import com.tienda.tienda.entity.Persona;
import com.tienda.tienda.service.IPaisService;
import com.tienda.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @En el Controller se maneja todo lo 
 */
@Controller
public class PersonaController {
    
    @Autowired //Inyeccion de dependencia 
    private IPersonaService personaService;
    
    
    @Autowired//Inyeccion de dependencia 
    private IPaisService paisService;
    
    
    // @getmapping se define el valor y la funcion a realiza, en este caso el /persona es la direccion
    
    @GetMapping("/persona")
    public String index(Model model){ //El model lo que hace s sustituir el atml para convertir lo que se llame titulo por table perosna
        //por lo que se llame perosna, sea la lista Persona
        List<Persona> listaPersona = personaService.getAllPersona(); //se crea la variabe lista
        model.addAttribute("titulo","tabla persona"); //nombre del texto llamado "titula" sera la tabla persona
        model.addAttribute("personas", listaPersona); //nombre de un texto "persona" sera listaPersona
        return "personas"; //direccion al templates.personas
    }
    
    @GetMapping("/personaN")
    public String crearPersona(Model model){
        List<Paises> listaPaises = paisService.listCountry();
        model.addAttribute("persona",new Persona());
        model.addAttribute("paises",listaPaises);
        return "crear"; //direccion al templates.crear
    }
    
    
    
    
    
    
    
    
    
}
