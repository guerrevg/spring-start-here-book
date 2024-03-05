package config;

import beans.Parrot;
import beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");

        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");

        return p;
    }

    @Bean
   // public Person person(Parrot parrot2) { // the name of the param matches the name ob the bean representing Miki or
    public Person person(@Qualifier("parrot2") Parrot parrot) { // with @Qualifier you tell exactly what bean do you want
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);

        return p;
    }
}
