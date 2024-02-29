package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // when creating the context instance, we send the ProjectConfig class as a parameter to instruct Spring to use it
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class); // get the bean from the context
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        int ten = context.getBean(Integer.class);
        System.out.println(ten);

    }

}
