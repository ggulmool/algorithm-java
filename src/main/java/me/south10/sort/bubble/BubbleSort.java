package me.south10.sort.bubble;

/**
 * Created by south10 on 2016-03-16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 5};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
