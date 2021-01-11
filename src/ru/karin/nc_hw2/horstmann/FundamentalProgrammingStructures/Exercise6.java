package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
 * BigInteger. Compute the factorial of 1000.
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        BigInteger factorial = new BigInteger("1");
        for (int i=2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
