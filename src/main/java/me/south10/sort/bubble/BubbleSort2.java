package me.south10.sort.bubble;

import java.util.Arrays;

/**
 * Created by south10 on 2016-03-16.
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 3, 9};
        print(arr);
        bubbleSort(arr);
        print(arr);

    }

    private static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
