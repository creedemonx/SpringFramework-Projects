package com.gerardo.curso.springboot.webapp.springboot_web.models;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration 
@PropertySources({
            @PropertySource(value = "classpath:values.properties", encoding =  "UTF8"),
})
public class ValuesConfig {
   
}
