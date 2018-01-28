package me.ggulmool.sort.bubble;

import java.util.Arrays;

/**
 * Created by ggulmool on 2016-03-16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {9, 6, 3, 5};

        for(int i=0; i<data.length-1; i++){
            for(int j=0; j<data.length-1-i; j++){
                if(data[j]>data[j+1]){
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
            System.out.println(Arrays.toString(data));
        }

        System.out.println("버블정렬 결과");
        System.out.println(Arrays.toString(data));
    }
}
