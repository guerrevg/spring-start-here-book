package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var p = context.getBean(Parrot.class); // of the 3 beans gets the one with the @Primary annotation
        System.out.println(p.getName());
    }

}
