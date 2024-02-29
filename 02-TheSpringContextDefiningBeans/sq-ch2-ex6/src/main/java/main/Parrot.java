package main;

import org.springframework.stereotype.Component;

@Component // instruct spring to create an instance of this class and add it to its context
public class Parrot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
