package com.learningjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        String name = a + " " + b;
        System.out.println("Name is " + name);
//        Byte < Short < Char < Int < Long < Float < Double
    }
}