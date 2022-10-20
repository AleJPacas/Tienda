/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tienda.tienda.entity.Paises;



/**
 *
 * Donde se buscan todas
 */

@Repository
public interface PaisRepo extends CrudRepository<Paises,Long>{
    
}
