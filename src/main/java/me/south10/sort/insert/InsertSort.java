package me.south10.sort.insert;

import java.util.Arrays;

/**
 * Created by south10 on 2016-03-17.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] data = {5, 4, 2, 1, 3};

        for(int i=1; i<data.length; i++){
            int key = data[i];
            int j = 0;
            for(j=i-1; j>=0; j--){
                if(data[j]>key){
                    data[j+1] = data[j];
                }else{
                    break;
                }
            }
            data[j+1] = key;
            System.out.println(Arrays.toString(data));
        }
        System.out.println("삽입정렬 결과");
        System.out.println(Arrays.toString(data));
    }
}
