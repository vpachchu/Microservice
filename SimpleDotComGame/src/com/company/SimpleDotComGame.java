package com.company;

public class SimpleDotComGame {


    int hit=0,count=0;
    int[] location;
    String result="miss";


    String checkYourself(String userGuess)
    {
        for(int cell:location)
        {
          //  ++count;
            int userGuessInt=Integer.parseInt(userGuess);
            if(userGuessInt==cell)
            {
                result="Hit";
                hit+=1;

            }
            if (hit==location.length)
            {
                result="Kill";

            }
        }
        count++;
        System.out.println("Checking the cell "+userGuess+" : "+result);
        if (result=="Kill")
        {
            System.out.println("You took "+count+" guesses");

        }
        return result;

    }

    public void setCells(int[] location)
    {
        this.location=location;

    }

}
