package com.learningjava;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter!");
        }

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a uppercase letter!");
        }
    }
}
