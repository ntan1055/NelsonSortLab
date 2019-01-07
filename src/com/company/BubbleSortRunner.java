package com.company;

public class BubbleSortRunner {

    public static void main(String[] args)
    {
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
        int[] before = testArr;
        int[] testArr1 = testArr;
        System.out.print("Before: ");
        for(int num:testArr)
            System.out.print(num + " ");
        System.out.println();

        SortingUtil.bubbleSort(testArr1, 0, 1);
        int[] after = testArr1;

        System.out.print("After: ");
        for(int num:testArr)
            System.out.print(num + " ");
        System.out.println();

        SortingUtil.isSorted(testArr, 0,1);
        SortingUtil.checkSum(before, after);
    }
}
