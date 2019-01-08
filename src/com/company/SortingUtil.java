package com.company;

public class SortingUtil
{
    public static int[] randIntArr(int count)
    {
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
        {
            array[i] = (int)(Math.random() * 10001);
        }
        return array;
    }


    public static void checkSum(int[] before, int[] after)
    {
        boolean equalSum;
        int beforeSum = 0;
        int afterSum = 0;
        for(int i = 0; i < before.length; i++)
        {
            beforeSum = beforeSum + before[i];
        }
        for(int j = 0; j < after.length; j++)
        {
            afterSum = afterSum + after[j];
        }
        if(beforeSum == afterSum)
        {
            equalSum = true;
        }
        else
        {
            equalSum = false;
        }
        if(equalSum = true)
        {
            System.out.println("The sum before and after are equal.");
        }
        if(equalSum = false)
        {
            System.out.println("The sum before and after are not equal.");
        }
    }
}
