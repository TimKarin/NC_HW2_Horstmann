package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

import java.util.Scanner;

/**
 * Write a program that reads a string and prints all of its nonempty
 * substrings.
 */
public class Exercise8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i=0; i<str.length()-1; i++) {
            for (int j=i+1; j<str.length()-1; j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
