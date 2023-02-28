package com.basiccoreprogram;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        // INITIALIZATION
        int n, head_cnt = 0, tail_cnt = 0;
        double heads, tails;

        Scanner sc = new Scanner(System.in);

        // INPUT DATA
        System.out.print("enter number of times you want to flip the coin: ");
        n = sc.nextInt();

        // COMPUTATION
        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.5)
                tail_cnt++;
            else
                head_cnt++;
        }

        heads = head_cnt / (double) n * 100;
        tails = tail_cnt / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");
    }
}
