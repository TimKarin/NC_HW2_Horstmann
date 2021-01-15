package ru.karin.nc_hw2.horstmann.Interfaces;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Subdirectories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File dir = new File(sc.nextLine());

        System.out.println("Through lambda");
        File[] subdirLam = dir.listFiles((s) -> s.isDirectory());
        for (File f : subdirLam) {
            System.out.println(f.getName());
        }

        System.out.println("Through method Expression");
        File[] subdirExpr = dir.listFiles(File::isDirectory);
        for (File f : subdirExpr) {
            System.out.println(f.getName());
        }

        System.out.println("Inner class");
        File[] subdirInner = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        for (File f : subdirInner) {
            System.out.println(f.getName());
        }

    }
}
