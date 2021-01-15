package ru.karin.nc_hw2.horstmann.Interfaces;

import java.io.File;
import java.util.Scanner;

public class Exercese12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dir path");
        File dir = new File(sc.nextLine());
        System.out.println("Enter extension");
        String extention = sc.nextLine();

        String[] files = dir.list((s, ex)->ex.endsWith(extention));
        for(String s: files) {
            System.out.println(s);
        }
    }

}
