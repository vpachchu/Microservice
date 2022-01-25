package com.company;

public class Main {

    public static void main(String[] args) {
	// =======================================================Dog class=======================================================
   Dog d1=new Dog();
   Dog d2=new Dog();
   Dog d3=new Dog();

   d1.name="Jimmy";
   d1.weight=10;

   d2.name="Bruce";
   d2.weight=5;

   d3.name="Browny";
   d3.weight=16;

   d1.bark();
   d2.bark();
   d3.bark();

   //=======================================================Protected Dog class=======================================================
       System.out.println("\n===== I'm Protected/Encapsulated Class ======\n");
       ProtectedDog pd1=new ProtectedDog();
       ProtectedDog pd2=new ProtectedDog();

//       pd1.name="Puppy";
//       pd1.weight=18;
// we can't set name and weight as above. because name and weight are private variables. thus, we can use setters and getters.

        pd1.setName("Puppy");
      //  System.out.println(pd1.getName());

        pd1.setWeight(0);
       // System.out.println(pd1.getWeight());

       // pd1.bark(); bark method call inside setWeight method

        pd2.setName("Scooby");
        pd2.setWeight(10);

   //=======================================================Protected Dog class=======================================================
        System.out.println("\n===== I'm DogArray ======\n");
        ProtectedDog[] dogArray=new ProtectedDog[5];
        int x=0;

        while (x<5)
        {
            dogArray[x]=new ProtectedDog();
            dogArray[x].setName("Dog"+x);
            dogArray[x].setWeight(x+5);
            x=x+1;
        }






    }
}
