package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {4, 7, 2, 8, 1, 0};
        int iMin = 0;
        int iMax = 0;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[iMin]) {
                iMin = i;
            }
            if (arr[i] >= arr[iMax]) {
                iMax = i;
            }
        }

        int tmp = arr[iMax];
        arr[iMax] = arr[iMin];
        arr[iMin] = tmp;

        System.out.println(Arrays.toString(arr));

    }
}