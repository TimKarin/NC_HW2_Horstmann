package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Write a program that reads an integer and prints it in binary, octal, and
 * hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
 */

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("In Binary: " + Integer.toBinaryString(number));
        System.out.println("In Octal: " + Integer.toOctalString(number));
        System.out.println("In Hexadecimal: " + Integer.toHexString(number));
        float reciprocal = (float) (1.0 / number);
        System.out.println("reciprocal: " + Float.toHexString(reciprocal));
    }
}
