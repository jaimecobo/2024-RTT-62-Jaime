package com.perscholas.java_basics.slides303_6;

import javax.swing.*;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arrayOne = {6, 0, 3, 5, 1, 10, 20, -1};
        int temp;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne.length - 1; j++) {
                if(arrayOne[j] > arrayOne[j+1]) {
                    temp = arrayOne[j];
                    arrayOne[j] = arrayOne[j + 1];
                    arrayOne[j + 1] = temp;
                }
//                System.out.println(Arrays.toString(arrayOne));
            }
            System.out.println(Arrays.toString(arrayOne));
        }


        int[] nums = {4, 2, 9, 13, 1, 0, -1};
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if (nums[j] < nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
//                System.out.println(Arrays.toString(nums));
            }
            System.out.println(Arrays.toString(nums));
        }

        int[] arrayTwo = {9, 4, 5, 1, 3, 0, 17, -1};
        for (int i = 0; i < arrayTwo.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arrayTwo.length - 1; j++) {
                if(arrayTwo[j] > arrayTwo[j+1]) {
                    temp = arrayTwo[j];
                    arrayTwo[j] = arrayTwo[j + 1];
                    arrayTwo[j + 1] = temp;
                    swapped = true;
                }
//                System.out.println(Arrays.toString(arrayOne));
            }
            System.out.println("Iteration = " + (i+1) + " ===> " + Arrays.toString(arrayTwo));
            if(!swapped){
                break;
            }
        }
    }
}
