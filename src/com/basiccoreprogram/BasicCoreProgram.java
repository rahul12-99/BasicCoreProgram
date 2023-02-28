package com.basiccoreprogram;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        // Taking user input
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter An Alphabet: ");
        char alphabet = Sc.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U'){
            System.out.println("Alphabet is Vowel:");
        }
        else {
            System.out.println("Alphabet is Consonant");
        }
    }
}
