package com.example.comparablecomparator;

import java.util.*;

public class TestComparable {
    public static void main(String[] args) {
        List<Node> list = new ArrayList<>();
        list.add(new Node("a",22));
        list.add(new Node("b",15));
        list.add(new Node("c",100));

        Collections.sort(list);

        System.out.println(list);


    }
}

class Node implements Comparable<Node>{

    String name;
    int age;

    Node(String name, int age){
        this.name = name;
        this.age= age;
    }

    @Override
    public int compareTo(Node that) {
        if(this.age > that.age){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return name+" "+age;
    }
}
