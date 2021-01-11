package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a program that prints a lottery combination, picking six distinct
 * numbers between 1 and 49. To pick six distinct numbers, start with an
 * array list filled with 1...49. Pick a random index and remove the element.
 * Repeat six times. Print the result in sorted order.
 */
public class Exercise13 {
    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList(49);
        int[] selected = new int[6];
        for (int i=1; i<50; i++) {
            allNumbers.add(i);
        }
        for (int i=0; i<6; i++) {
            int randIndex = (int) (Math.random() * allNumbers.size());
            selected[i] = allNumbers.get(randIndex);
            allNumbers.remove(randIndex);
        }
        Arrays.sort(selected);
        System.out.println(Arrays.toString(selected));
    }
}
