package me.south10.basic;

/**
 * Created by south10 on 2016-03-21.
 * 최빈값(MODE) : 가장 많이 나타난 값
 */
public class Basic02 {
    public static void main(String[] args) {
        // 0~5까지범위의 값만 들어온다고 가정
        int[] data = {1, 3, 4, 3, 5};
        int mode = 0; // 최빈값 담길 변수
        int[] index = new int[6];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<data.length; i++){
            index[data[i]]++;
        }

        for(int i=0; i<index.length; i++){
            if(max < index[i]){
                max = index[i];
                mode = i;
            }
        }

        System.out.println("최빈값 : " + mode + ", " + max +"번");
    }
}
