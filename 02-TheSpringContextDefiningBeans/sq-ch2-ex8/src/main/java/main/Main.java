package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot(); // create the instance that we want to add to the context
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x; // define a supplier to return the instance

        // call the registerBean() method to add the instance to the context
        context.registerBean("parrot1",
                Parrot.class,
                parrotSupplier,
                bc -> bc.setPrimary(true)); // BeanDefinitionCustomizer

        Parrot p = context.getBean("parrot1", Parrot.class);
        System.out.println(p.getName());
    }
}
