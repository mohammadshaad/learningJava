package com.learningjava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        boolean result = isArmstrongNum();
//        System.out.println(result);

        for (int i = 100; i < 1000; i++)
        {
            if (isArmstrongNum(i))
            {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrongNum(int num) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
        int original = num;
        int sum = 0;

        while (num > 0)
        {
            int rem = num % 10;
            num = num / 10;
            int cube = rem * rem * rem;
            sum += cube;
        }

        return sum == original;
    }
}
