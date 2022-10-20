/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tienda.tienda.entity.Persona;
/**
 *
 * Donde se buscan todas
 */
@Repository
public interface PersonasRepo extends CrudRepository<Persona,String>{
    public Object findById(long id);
    
    public void deleteById(long id);
    
}
