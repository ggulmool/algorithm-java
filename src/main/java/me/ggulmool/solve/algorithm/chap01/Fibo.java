package me.ggulmool.solve.algorithm.chap01;

/**
 * Created by ggulmool on 2016-03-28.
 */
public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        System.out.println(fibo2(8));
        System.out.println(fibo3(10));
    }

    private static long fibo(int n) {
        if(n == 1 || n == 2)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }

    private static long fibo2(int n) {
        final int MAX_SIZE = 200;
        long[] memo = new long[MAX_SIZE];
        if(memo[n] > 0){
            return memo[n];
        }

        if(n == 1 || n == 2){
            return memo[n] = 1;
        }else{
            return memo[n] = fibo2(n-1) + fibo2(n-2);
        }
    }

    private static long fibo3(int n) {
        long i, f_i, f_i_1, t;

        if(n == 1 || n == 2){
            return 1;
        }

        f_i_1 = 1;
        f_i = 1;
        for(i=3; i<=n; i++){
            t = f_i;
            f_i = f_i_1 + f_i;
            f_i_1 = t;
        }
        return f_i;
    }
}
