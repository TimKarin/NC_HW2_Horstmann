package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

import java.util.Scanner;

/**
 * Write a program that reads an integer angle (which may be positive or
 * negative) and normalizes it to a value between 0 and 359 degrees. Try
 * it first with the % operator, then with floorMod.
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angleSource = sc.nextInt();
        int angleNormal = angleSource % 360;
        if (angleNormal < 0) {
            angleNormal += 360;
        }
        System.out.println("with %: " + angleNormal);

        int angleFloorMod = Math.floorMod(angleSource, 360);
        System.out.println("with floorMod: " + angleFloorMod);
    }
}
