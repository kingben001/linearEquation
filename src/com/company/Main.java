package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value for m:");
        double m = keyboard.nextDouble();
        System.out.println("Enter a value for x:");
        double x = keyboard.nextDouble();
        System.out.println("Enter a value for b:");
        double b = keyboard.nextDouble();

        double y = b*x*m;
        System.out.println(y);
    }
}
