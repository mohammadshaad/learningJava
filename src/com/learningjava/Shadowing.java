package com.learningjava;

public class Shadowing {
    static int x = 0;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 1;
        System.out.println(x);
        fun();
    }

    static void fun()
    {
        System.out.println(x);
    }
}
