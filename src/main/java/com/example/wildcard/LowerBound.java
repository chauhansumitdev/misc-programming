package com.example.wildcard;
import java.util.ArrayList;
import java.util.List;
public class LowerBound {
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addIntegers(numList);
        addIntegers(objList);

        System.out.println("numList: " + numList);
        System.out.println("objList: " + objList);
    }
}
