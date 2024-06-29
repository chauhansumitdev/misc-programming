package com.example.streams;

import java.util.Arrays;
import java.util.List;

// the side effect or the output
// ed collect, forEach, reduce, count;
public class Terminal {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.forEach(val -> System.out.println(val*2));

        long val = list.stream().count();

        System.out.print(val);
    }
}
