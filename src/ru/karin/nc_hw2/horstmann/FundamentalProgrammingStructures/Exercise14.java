package ru.karin.nc_hw2.horstmann.FundamentalProgrammingStructures;

import java.util.Scanner;

/**
 * Write a program that reads a two-dimensional array of integers and determines
 * whether it is a magic square (that is, whether the sum of all
 * rows, all columns, and the diagonals is the same). Accept lines of input
 * that you break up into individual integers, and stop when the user enters
 * a blank line. For example, with the input
 */
public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] splitStr = str.split(" ");
        int[][] matrix = new int[splitStr.length][splitStr.length];
        for (int i=0; i < splitStr.length; i++) {
            for(int j=0; j<splitStr.length; j++) {
                matrix[i][j] = Integer.parseInt(splitStr[j]);
            }
            str = sc.nextLine();
            splitStr = str.split(" ");
        }

        int mainDiagSum = 0;
        int minorDiagSum = 0;

        for(int i=0; i<matrix.length; i++) {
            mainDiagSum += matrix[i][i];
            minorDiagSum +=matrix[matrix.length-i-1][matrix.length-i-1];
        }

        if(mainDiagSum != minorDiagSum) {
            System.out.println("false");
            return;
        }

        for (int i=0; i<matrix.length; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j=0; j<matrix.length; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != mainDiagSum || colSum != mainDiagSum){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
