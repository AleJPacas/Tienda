/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.tienda.service;
import com.tienda.tienda.entity.Persona;
import java.util.List;
/**
 *
 * @Se guardan los objetos y se convierten en entidades, se crea la lista y
 * se almacenan en la LIST<>
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaById (long id);
    public void savePersona (Persona persona);
    public void delete (long id);
    
}