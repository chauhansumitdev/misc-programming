package com.example.wildcard;
import  java.util.*;
public class Bounded {

    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        sumOfList(list);
    }

    public static void sumOfList(List<? extends Number> list){
        double res = 0.0;

        for(Number val : list){
            res+=val.doubleValue();
        }

        System.out.println(res);
    }
}
