package com.example.springboot01;

import org.springframework.stereotype.Component;

@Component
public class Meals {
    private String animaltype;

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public void eat()
    {
        System.out.println("feeding...");
    }
}
