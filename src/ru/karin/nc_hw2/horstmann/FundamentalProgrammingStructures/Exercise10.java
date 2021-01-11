package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

/**
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 */
public class Exercise10 {
    public static void main(String[] args) {
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyz";
        long randLong = (long) (Math.random() * Long.MAX_VALUE);
        while (randLong > 36){
            int rem = (int)(randLong%36);
            System.out.print((char)(alphabet.charAt(rem)));
            randLong /= 36;
        }
    }
}
