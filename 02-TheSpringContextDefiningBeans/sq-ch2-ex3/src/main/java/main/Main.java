package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //var parrot = context.getBean(Parrot.class); // exception, spring cannot guess which of the 3 Parrot instances we refer to

        var p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());
    }

}
