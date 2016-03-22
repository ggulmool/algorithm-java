package me.south10.solve.algorithm.chap00;

import java.util.Scanner;

/**
 * Created by south10 on 2016-03-22.
 */
public class ArrayQueue {
    static final int QUEUE_CAPACITY = 8;
    static int[] queue = new int[QUEUE_CAPACITY];
    static int head = 0;
    static int tail = -1;
    static int queue_size = 0;

    public static void main(String[] args) {
        int number, r;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("input number:");
            number = scanner.nextInt();

            if(number > 0){
                enqueue(number);
            }else if(number == 0){
                r = dequeue();
                System.out.printf("[%d]\n", r);
            }
        }while(number >= 0);
    }

    private static int dequeue() {
        int r;
        if(queue_size == 0){
            System.out.println("queue empty!");
            return 0;
        }

        r = queue[head];
        //head++;
        head = (head + 1) % QUEUE_CAPACITY; // 원형큐
        queue_size--;
        return r;
    }

    private static void enqueue(int number) {
        if(queue_size == QUEUE_CAPACITY){
            System.out.println("queue full!");
            return;
        }

        //tail++;
        tail = (tail + 1) % QUEUE_CAPACITY; // 원형큐
        queue_size++;
        queue[tail] = number;
    }
}
