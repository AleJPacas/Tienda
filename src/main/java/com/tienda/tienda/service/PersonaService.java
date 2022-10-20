/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.service;

import com.tienda.tienda.entity.Persona;
import com.tienda.tienda.repository.PersonasRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Sebastian Pacas
 */
public class PersonaService implements IPersonaService{
    @Autowired //solamente añade
    private PersonasRepo perso; // solo esto porque ya existe la lsitad e datos
    
    @Override
    public List<Persona> getAllPersona() {
        return (List<Persona>) perso.findAll();
        //Muestra todo lo necesario ae personas
    }

    @Override
    public Persona getPersonaById(long id) {
        return perso.findById(id).orElse(null);
        //solamente se almacena los darotados especificos por ID
    }

    @Override
    public void savePersona(Persona persona) {
        perso.save(persona);
        //guardar por persona
    }

    @Override
    public void delete(long id) {
        perso.deleteById(id);
        //Eliminar por id
    }
    
}
