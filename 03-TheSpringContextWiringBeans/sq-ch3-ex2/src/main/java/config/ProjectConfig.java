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
    public Person person() {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot()); // setting the reference of the parrot bean to the person's attribute
        // if the parrot bean already exists in the context, Spring take the instance from its context
        // if the parrot bean does not yet exist in te context, Spring calls parrot() add the bean to its context
        // and return the bean

        return p;
    }
}
