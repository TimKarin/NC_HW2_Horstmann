package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

import java.util.Scanner;

/**
 * Using only the conditional operator, write a program that reads three
 * integers and prints the largest. Repeat with Math.max.
 */
public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("max: " + a);
            } else {
                System.out.println("max: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("max: " + b);
            } else {
                System.out.println("max: " + c);
            }
        }
        int maxMath = Math.max(a, Math.max(b, c));
        System.out.println("max with Math.max: " + maxMath);
    }
}
