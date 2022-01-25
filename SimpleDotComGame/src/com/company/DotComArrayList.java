package com.company;

import java.util.ArrayList;

public class DotComArrayList {

    private ArrayList<String> locationcell=new ArrayList<>();

    String checkCell(String userInput)
    {
        String result="miss";
        int index=locationcell.indexOf(userInput);
        if(index>=0)
        {
            result="hit";
            locationcell.remove(index);
        }
        if (locationcell.isEmpty())
        {
            result="kill";


        }
        System.out.println("Checking the cell "+userInput+" : "+result);
        return result;
    }
    public void setCells(ArrayList<String> location)
    {
       locationcell=location;

    }

}
