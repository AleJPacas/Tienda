
package com.tienda.tienda;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class webconfig implements WebMvcConfigurer{
    
    //Para traduccion
    @Bean //siguiente metodo es una config de la app
    public SessionLocaleResolver localeResolver(){ 
        var slr = new SessionLocaleResolver(); //session localresolver = instancia de la funicon de sesionlocal..
        slr.setDefaultLocale(new Locale("es")); //local es la region a la  que se obtiene del usuario = Local, se indica "es"
        return slr;
    } 
    //Para traduccion
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang"); // parametro para pasar el lenguaje
        return lci;
    }
    //detecta el cambio de usuario hacia el local o pag
    @Override
    public void addInterceptors(InterceptorRegistry registro){
        registro.addInterceptor(localeChangeInterceptor());
    }
    //parametro de recepccion de los cambios 
    
    
}
