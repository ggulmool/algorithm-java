package me.south10.solve.algorithm.chap01;

import java.util.Scanner;

/**
 * Created by south10 on 2016-03-28.
 * input number of bills:3
 * input bills: 5 2 1
 * input money: 5
 * result : 4
 */
public class Pay {
    public static void main(String[] args) {
        final int MAXN = 50;
        int num_bills, money, i;
        int[] bills = new int[MAXN];

        System.out.print("input number of bills:");
        Scanner scanner = new Scanner(System.in);
        num_bills = scanner.nextInt();
        System.out.print("input bills: ");
        for(i=0; i<num_bills; i++){
            bills[i] = scanner.nextInt();
        }
        System.out.print("input money: ");
        money = scanner.nextInt();
        System.out.printf("result : %d\n", pay(money, bills, num_bills));
    }

    private static int pay(int money, int[] bills, int n) {
        int count = 0;
        int i, t;
        // System.out.println("money : " + money + ", money % bills[0] : " + money % bills[0]);
        if(n == 1){
            if(money % bills[0] == 0){
                return 1;
            }else{
                return 0;
            }
        }

        t = money / bills[n-1];
        for(i=0; i<=t; i++){
            count += pay(money - bills[n-1]*i, bills, n-1);
        }
        return count;
    }
}
