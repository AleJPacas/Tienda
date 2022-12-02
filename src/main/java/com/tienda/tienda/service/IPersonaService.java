
package com.tienda.tienda.service;
import java.util.List;
import com.tienda.tienda.entity.Persona;


public interface IPersonaService {
    public List<Persona> getAllPersonas();
    public Persona getPersonaById (long Id);
    public void savePersona(Persona persona);
    public void delete(long id);
    public Persona findByNombre(String nombre);
}
