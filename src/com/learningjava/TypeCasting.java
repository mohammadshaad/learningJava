package com.learningjava;

public class TypeCasting {
    public static void main(String[] args) {
//        Widening Casting: Automatically converting a smaller type to a larger type size
//        byte -> short -> char -> int -> long -> float -> double

//        Narrowing Casting: Manually converting a larger type to a smaller type size
//        double -> float -> long -> int -> char -> short -> byte

        float myFloat = 25;
        int myInt = (int) myFloat;

        System.out.println(myFloat);
        System.out.println(myInt);
    }
}
