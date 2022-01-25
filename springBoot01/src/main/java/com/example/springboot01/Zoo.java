package com.example.springboot01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Zoo {
    private String address;
    private int numOfAnimals;
    // bean from  class Meals
    @Autowired
    private Meals meat;

    public Zoo(){
        System.out.println("I'm a Zoo constructor to check whether Zoo object created or not ");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfAnimals() {
        return numOfAnimals;
    }

    public void setNumOfAnimals(int numOfAnimals) {
        this.numOfAnimals = numOfAnimals;
    }

    public void feed()
    {

        System.out.println("looking for meal...");
        meat.eat();
    }
}
