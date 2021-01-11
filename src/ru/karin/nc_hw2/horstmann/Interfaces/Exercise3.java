package ru.karin.nc_hw2.horstmann.Interfaces;

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

/**
 * What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note
 * that each type is its own supertype. A class or interface without declared
 * supertype has supertype Object.
 */
public class Exercise3 {

    public static void main(String[] args) {
        System.out.println("\nString");
        System.out.println((String.class.getSuperclass().toString()));
        Class[] stringInterfases = (String.class.getInterfaces());
        for (int i=0; i< stringInterfases.length; i++) {
            System.out.println(stringInterfases[i].toString());
        }

//        String
//        class java.lang.Object
//        interface java.io.Serializable
//        interface java.lang.Comparable
//        interface java.lang.CharSequence
//        interface java.lang.constant.Constable
//        interface java.lang.constant.ConstantDesc


        System.out.println("\nScanner");
        System.out.println((Scanner.class.getSuperclass().toString()));
        Class[] scannerInterfases = (Scanner.class.getInterfaces());
        for (int i=0; i< scannerInterfases.length; i++) {
            System.out.println(scannerInterfases[i].toString());
        }

//        Scanner
//        class java.lang.Object
//        interface java.util.Iterator
//        interface java.io.Closeable

        System.out.println("\nImageOutputStream");
        //System.out.println((ImageOutputStream.class.getSuperclass().toString())); //null
        Class[] imageOutputStreamInterfases = (ImageOutputStream.class.getInterfaces());
        for (int i=0; i< imageOutputStreamInterfases.length; i++) {
            System.out.println(imageOutputStreamInterfases[i].toString());
        }
//        ImageOutputStream
//        interface javax.imageio.stream.ImageInputStream
//        interface java.io.DataOutput


    };
}
