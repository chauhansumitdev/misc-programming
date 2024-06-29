package com.example.streams;

// transformaing a stream into another
// often lazy; they dont perfoem any operation till the terminal condition is met.

// eg filter()  map() sorted() distinct() limit() skip()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermediate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> divByTwo  = list.stream().filter(val -> val%2==0).toList();

        System.out.print(divByTwo);
    }
}
