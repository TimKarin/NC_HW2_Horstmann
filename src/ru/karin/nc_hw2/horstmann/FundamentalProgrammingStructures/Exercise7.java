package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

import java.util.Scanner;

/**
 * Write a program that reads in two integers between 0 and 4294967295,
 * stores them in int variables, and computes and displays their unsigned
 * sum, difference, product, quotient, and remainder. Do not convert them
 * to long values.
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseUnsignedInt(sc.next());
        int b = Integer.parseUnsignedInt(sc.next());
        System.out.println("Sum: " + Math.abs(a+b));
        System.out.println("difference: " + Math.abs(a-b));
        System.out.println("product: " + Math.abs(a*b));
        System.out.println("quotient: " + Integer.divideUnsigned(a, b));
        System.out.println("remainder: " + Integer.remainderUnsigned(a, b));
    }
}