package com.basiccoreprogram;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        // taking user input
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int number = Sc.nextInt();
        if(number % 2 == 0){
            System.out.println("The Number Is EVEN:");
        }
        else {
            System.out.println("The Number Is ODD:");
        }
    }
}
