package ru.karin.nc_hw2.horstmann.Interfaces;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Exrercise13 {
    public static File[] sortFile (File[] files) {
        Arrays.sort(files, (f1, f2)->{
            if (f1.isDirectory() && f2.isFile()) {
                return -1;
            } else if (f1.isFile() && f2.isDirectory()) {
                return 1;
            }else {
                return f1.getAbsolutePath().compareTo(f2.getAbsolutePath());
            }
        });
        return files;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File dir = new File(sc.nextLine());
        File[] subbdirAndFiles = dir.listFiles();
        sortFile(subbdirAndFiles);
        for (File f: subbdirAndFiles) {
            System.out.println(f.getName());
        }
    }
}
