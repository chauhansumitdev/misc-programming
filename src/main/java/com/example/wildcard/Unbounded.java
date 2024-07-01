package com.example.wildcard;

import java.util.*;
public class Unbounded {
    public static void main(String[] args) {
        List<?> names = Arrays.asList("name","nam");

        for(Object val : names){
            System.out.println(val);
        }
    }
}
