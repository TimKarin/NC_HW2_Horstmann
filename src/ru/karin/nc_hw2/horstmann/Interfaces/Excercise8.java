package ru.karin.nc_hw2.horstmann.Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
 comp) that keeps calling Collections.shuffle on the array list until the elements
 are in increasing order, as determined by the comparator.
 */
public class Excercise8 {

    public void luckySort(ArrayList<String> strings, Comparator<String> com) {
        while(true) {
            boolean sorted = true;
            for (int i = 0; i < strings.size() - 1; i++) {
                if (com.compare(strings.get(i), strings.get(i + 1)) > 0) {
                    sorted = false;
                    break;
                }
            }
            if (sorted == false) {
                Collections.shuffle(strings);
            } else {
                return;
            }
        }
    }
}
