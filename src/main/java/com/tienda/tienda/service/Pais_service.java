
package com.tienda.tienda.service;
import com.tienda.tienda.entity.Paises;
import com.tienda.tienda.repository.PaisRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Se muestran todos los valroes que se encuentras ya instaciados en la lista
 */
@Service
public class Pais_service implements IPaisService{
    
    @Autowired //hacen el import de las dependencias y crear el objeto sin crear una lista
    private PaisRepo paisReposi;
    
    @Override
    public List<Paises> listCountry() {
        return (List<Paises>)paisReposi.findAll();
    }
    
}
