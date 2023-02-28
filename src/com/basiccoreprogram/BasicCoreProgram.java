package com.basiccoreprogram;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        double nthHarmonic = 0;
        System.out.println("Enter a number");
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        // Loop to apply formula
        for (int i = 1; i <= N; i++){
            nthHarmonic += (float)1/i;
        }
        System.out.println("Nth Harmonic Value is: " + nthHarmonic);
    }
}
