
package com.tienda.tienda.service;
import com.tienda.tienda.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{
    @Autowired
    public IPersonaService personaService;
    
    @Override
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException{
        Persona persona = this.personaService.findByNombre(username);
        Userprincipal userprincipal = new Userprincipal(persona);
        return userprincipal;
    }
    
}
