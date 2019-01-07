package com.company;

public class SortingUtil
{
    public static void bubbleSort(int[] arr, int i, int j)
    {
        boolean swap = true;
        while(swap)
        {
            swap = false;
            for(j = 1; j < arr.length; j++)
            {
                i = j - 1;
                if(arr[j] < arr[i])
                {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                    swap = true;
                }
            }
        }
    }

    public static int[] randIntArr(int count)
    {
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
        {
            array[i] = (int)(Math.random() * 10001);
        }
        return array;
    }

    public static void isSorted(int[] array, int i, int j)
    {
        boolean sorted;
        i = j - 1;
        for(j = 1; j < array.length; j++)
        {
            if(array[j] < array[i])
            {
                sorted = false;
                j = array.length;
                i = array.length;

            }
            if(sorted = false)
            {
            System.out.println("The array is not sorted.");
        }
        else if(sorted = true)
        {
            System.out.println("The array is sorted.");
        }
        }

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
