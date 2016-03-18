package me.south10.basic;

/**
 * Created by south10 on 2016-03-18.
 * 6의 배수이면서 7의 배수인 수 찾기
 */
public class Basic01 {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;

        while(num++<100){
            // true || true => true, true || false => true, false || true => true, false || false => false
            if(num % 6 != 0 || num % 7 != 0){
                continue;
            }
            count++;
            System.out.println("--------------------------------------");
            System.out.println(num + "/" + (num % 6 !=0 || num % 7 !=0));
            System.out.println("--------------------------------------");
        }
        System.out.println("count : " + count);
    }
}
