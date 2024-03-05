package config;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");

        return p;
    }

    @Bean
    // we instruct Spring to provide a bean from its context by defining a parameter for the method
    public Person person(Parrot parrot) { // Spring injects the parrot bean into this parameter.
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot); // set the attribute with reference Spring provided

        return p;
    }
}
