package org.RemovingXMLConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@ComponentScan(basePackages ="org.RemovingXMLConfiguration.javaConfig")
@Configuration
class javaConfig {

    @Bean
    public  Address address(){
        return new Address();
    }

    @Bean
    public Student student() {
        return new Student(address());
    }

}
