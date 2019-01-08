package com.company;

public class BubbleSort
{
    public static void bubbleSort(int[] arr)
    {
        int j;
        int i;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (j = 1; j < arr.length; j++) {
                i = j - 1;
                if (arr[j] < arr[i]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                    swap = true;
                }
            }
        }
    }
}
