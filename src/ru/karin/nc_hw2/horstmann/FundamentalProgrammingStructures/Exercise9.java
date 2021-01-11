package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

/**
 * Section 1.5.3, “String Comparison” (page 25) has an example of two strings
 * s and t so that s.equals(t) but s != t. Come up with a different example
 * that doesn’t use substring).
 */
public class Exercise9 {
    public static void main(String[] args) {
        String one = "5";
        System.out.println(one == Integer.toString(5));
        System.out.println(one.equals(Integer.toString(5)));
    }
}
