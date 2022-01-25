package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] comCells={4,5,6};
        SimpleDotComGame dot=new SimpleDotComGame();
      //  System.out.println(dot.checkYourself("2"));
        dot.setCells(comCells);
        dot.checkYourself("1");
        dot.checkYourself("2");
        dot.checkYourself("3");
        dot.checkYourself("4");
        dot.checkYourself("5");
        dot.checkYourself("6");


        //try giving   dot.checkYourself("4"); 3 times see what happens... is that a bug?? let's fix it in future chapters.

        System.out.println("++++++++++++++++++ Bug +++++++++++++++++++++");
        SimpleDotComGame dot1=new SimpleDotComGame();
        dot1.setCells(comCells);
        dot1.checkYourself("4");
        dot1.checkYourself("4");
        dot1.checkYourself("4");

        System.out.println("++++++++++++++++++ Resolved Bug with Arraylist +++++++++++++++++++++");

        ArrayList<String> dotcomcells=new ArrayList<>();
        dotcomcells.add("3");
        dotcomcells.add("4");
        dotcomcells.add("5");
        DotComArrayList rd=new DotComArrayList();
        rd.setCells(dotcomcells);
        rd.checkCell("1");
        rd.checkCell("2");
        rd.checkCell("3");
        rd.checkCell("4");
        rd.checkCell("5");
        rd.checkCell("6");

        ArrayList<String> dotcomcells1=new ArrayList<>();
        dotcomcells1.add("3");
        dotcomcells1.add("4");
        dotcomcells1.add("5");
        System.out.println();

        //we can't use sme array as it's empty.
        DotComArrayList rd1=new DotComArrayList();
        rd1.setCells(dotcomcells1);
        rd1.checkCell("3");
        rd1.checkCell("3");
        rd1.checkCell("3");




    }

}
