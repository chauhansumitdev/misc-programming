package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creation {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();

        for(int i=0;i<10;i++){
            names.add(i);
        }

        Stream<Integer> stream = names.stream();

        // way to create a stream using the collection


        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            arr[i]=i;
        }

        Stream<Integer> stream1= Arrays.stream(arr).boxed(); // because of typw mismatch we need to box Integer and int





    }
}
