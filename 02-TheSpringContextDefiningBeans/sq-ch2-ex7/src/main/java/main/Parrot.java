package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct // enable with javax.annotation-api dependency
    public void init() {
        this.setName("Kiki");
    }
}
