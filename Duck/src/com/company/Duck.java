package com.company;

 class Duck {


    static int countDuck;
    String word ="ducks";
    Boolean check=true;
    boolean check1=true;


    {
        System.out.println("I'm a empty block");
    }
     static final int STATIC_DUCK_SIZE=12;
    public Duck(int Size)
    {
        DUCK_SIZE=Size;

        countDuck++;
        if(countDuck==1)
        {
            word="duck";
        }
        System.out.println(countDuck+" "+word+" in the Farm.");
        System.out.println("Duck final size is "+ DUCK_SIZE);
        System.out.println("Duck static final size is "+ STATIC_DUCK_SIZE);
     //   System.out.println("Duck size is "+ Size);
    }

     final int DUCK_SIZE;


    public int takeNum(Integer i)
    {
        return i;
    }

    public  Integer takeInt(int x)
    {
        return x;
    }

}
