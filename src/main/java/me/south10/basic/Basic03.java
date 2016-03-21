package me.south10.basic;

/**
 * Created by south10 on 2016-03-21.
 * 가까운값 알고리즘
 */
public class Basic03 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 27, 17};
        int target = 25;
        int near = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<data.length; i++){
            int a = Math.abs(data[i]-target);
            if(min > a){
                min = a;
                near = data[i];
            }
        }

        System.out.println(target + "와 가까운 값 : " + near);
    }
}
