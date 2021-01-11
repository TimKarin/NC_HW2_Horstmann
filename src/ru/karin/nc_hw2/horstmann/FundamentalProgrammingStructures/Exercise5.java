package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

/**
 * What happens when you cast a double to an int that is larger than the
 * largest possible int value? Try it out.
 */
public class Exercise5 {

    public static void main(String[] args) {
        double d = 20000000000.0;
        int i = (int) d;
        System.out.println("result: " + i);
        System.out.println("It is equal to max integer value");
        System.out.println("max integer value: " + Integer.MAX_VALUE);
    }
}
