package com.company;

public class Dog {
    String name;
    int weight;

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
