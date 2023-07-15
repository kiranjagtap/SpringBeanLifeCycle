package org.example;

import org.springframework.stereotype.Component;

@Component
public class Blue implements Colour {
    @Override
    public String fill() {
        return "Red";
    }
}
