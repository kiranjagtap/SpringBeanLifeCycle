package org.example;

import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class Red implements Colour {
    @Override
    public String fill() {
        return "Red";
    }
}
