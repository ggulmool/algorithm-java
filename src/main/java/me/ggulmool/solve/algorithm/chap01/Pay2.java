package me.ggulmool.solve.algorithm.chap01;

/**
 * Created by ggulmool on 2016-03-28.
 */
public class Pay2 {
    public static void main(String[] args) {
        int[] bills = {5, 2, 1};
        int count = 0, money = 5, i0, i1;

        for(i0 = money; i0 >= 0; i0-= bills[0])
            for (i1 = i0; i1 >= 0; i1 -= bills[1])
                if(i1 % bills[2] == 0)
                    count++;

        System.out.println("count : " + count);
    }
}
