package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};

        Stream<Integer> stream = Arrays.stream(arr).boxed();


        //find 14 eexists
        List<Integer> li = new ArrayList<>();

        for (int j : arr) {
            li.add(j);
        }

        if (li.contains(14)) {
            int index = li.indexOf(14);
            System.out.println("number is available at index " + index + "-> " + arr[index]);
        }


    }
}
