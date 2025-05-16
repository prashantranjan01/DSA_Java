package arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        //new int[5]
        // creating the object in the heap memory.=> RunTime Dynamic Memory allocation
        // Each element itself is an object and  Each object will be stored in different part of memory
        System.out.println(arr[2]);

        String[] arr2 = new String[4];
        System.out.println(arr2[2]);

        String[] strArr = {"Ayush", "Prashant", "Vishal"};

        // Nice Thing to print Array
        System.out.println(Arrays.toString(strArr));

        //Arrays are mutable and string is immutable in java


    }
}
