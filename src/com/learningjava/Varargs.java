package com.learningjava;

import java.util.Arrays;
import java.util.Scanner;

public class Varargs {
    public static void main(String[] args) {
    demo(1, 2,3 ,4, 5, 6, 7, 8, 10);
    }

    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
