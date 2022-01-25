package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a={4,7,6,3};

        selectionSort(a);
        bubbleSort(a);
        insertionSort(a);
        

    }

    public static void selectionSort(int[] array)
    {
        int n=array.length;

        for (int i=0;i<n-1;i++)
        {
            int index=i;

            for (int j=i+1;j<n;j++)
            {
                if(array[index]>array[j])
                {
                    index=j;
                }
                int smallestElement = array[index];
                array[index]=array[i];
                array[i]=smallestElement;
            }
        }
        System.out.println("Selection sort ");

        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" , ");
        }






    }


    public static void bubbleSort(int[] array)
    {
        int n= array.length;

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

        }
        System.out.println("\nBubble sort ");

        for(int i=0;i<n;i++)
        {

            System.out.print(array[i]+" , ");
        }
    }


    public static void insertionSort(int[] array)
    {
        int n = array.length;
        for (int i=1;i<n;i++)
        {
           int j=i-1;
           int temp=array[i];

           while(j>=0 && temp<array[j])
           {
               array[j+1]=array[j];
               j--;
           }
           array[j+1]=temp;
        }

        System.out.println("\nInsertion sort ");

        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" , ");
        }

    }
}
