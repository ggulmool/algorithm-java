package me.ggulmool.solve.algorithm.chap00;

import java.util.Arrays;

/**
 * Created by ggulmool on 2016-03-21.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(arr));
        //leftRotate(arr, 2, 6);
        //rightRotate(arr, 2, 6);
        kRightRotate(arr, 0, 7, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static void kRightRotate(int[] arr, int start, int last, int k) {
        int i;

        for(i=0; i<k%(last-start+1); i++){
            rightRotate(arr,start,last);
        }
    }

    private static void leftRotate(int[] arr, int start, int last) {
        int i, temp;
        temp = arr[start];

        for(i=start; i<last; i++){
            arr[i] =  arr[i+1];
        }
        arr[last] = temp;

    }

    private static void rightRotate(int[] arr, int start, int last) {
        int i, temp;

        temp = arr[last];
        for(i=last; i>start; i--){
            arr[i] = arr[i-1];
        }
        arr[start] = temp;
    }
}
