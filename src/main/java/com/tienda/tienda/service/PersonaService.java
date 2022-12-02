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

@Service
public class PersonaService implements IPersonaService{
   
    @Autowired
    PersonasRepo personasRepo;
    
    @Override
    public List<Persona> getAllPersonas(){
        return (List<Persona>) personasRepo.findAll();
    }
    
    @Override
    public Persona getPersonaById(long id){
        return personasRepo.findById(id).orElse(null);
    }
    
    @Override
    public void savePersona (Persona persona){
        personasRepo.save(persona);
    }
    
    @Override
    public void delete(long id){
        personasRepo.deleteById(id);
    }
    
    @Override
    public Persona findByNombre (String nombre){
        return personasRepo.findByNombre(nombre);
    }
}
