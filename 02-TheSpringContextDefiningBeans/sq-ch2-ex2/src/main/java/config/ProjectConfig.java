package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // define this class as a Spring configuration class
public class ProjectConfig {

    @Bean // we instruct Spring to call this method when initializes the context and add the returned value to it
    public Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");

        return p; // Spring adds to its context the Parrot instance returned
    }

    @Bean
    public String hello() {
        return "Hello";
    }

    @Bean
    public Integer ten() {
        return 10;
    }
}
