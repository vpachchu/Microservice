package com.company;

public class ProtectedDog {
    private String name;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        if(weight<1)
        {
            System.out.println("Invalid Size you entered! for "+name+".");
        }
        else {
            bark();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bark()
    {
        if(weight>15)
        {
            System.out.println(name+" barks Woof! Woof!");
        }
        else if(weight>5)
        {
            System.out.println(name+" barks Ruff! Ruff!");
        }
        else
        {
            System.out.println(name+" barks Yip! Yip!");
        }
    }
}
