package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "koko") // sets the name of the bean
    public Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");

        return p;
    }

    @Bean(value = "miki")
    public Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");

        return p;
    }

    @Bean("riki")
    public Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");

        return p;
    }
}
