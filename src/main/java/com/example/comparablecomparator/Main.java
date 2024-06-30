package com.example.comparablecomparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(33,21,99,10);

        Comparator<Integer> comparator = (o1, o2) -> {
            if (o1%10 > o2%10) {
                return 1;
            } else {
                return -1;
            }
        };

        // kind of bubble sort like swap if 1 and no swap if -1;
        Collections.sort(list, comparator);

        System.out.println(list);


        List<String> stringList = Arrays.asList("abc","a","abcd");

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        System.out.println(stringList);
    }
}
