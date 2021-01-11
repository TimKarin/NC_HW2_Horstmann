package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

/**
 * Write a program that prints the smallest and largest positive double values.
 * Hint: Look up Math.nextUp in the Java API.
 */
public class Exercise4 {

    public static void main(String[] args) {
        System.out.println("smallest positive: " + Math.nextUp(0));
        System.out.println("largest positive: " + Double.MAX_VALUE);
    }
}
