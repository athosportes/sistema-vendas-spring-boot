package io.github.athosportes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurations {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de vendas";
    }
}
