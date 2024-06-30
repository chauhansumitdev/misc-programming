package com.example.lambda;

public class Main {

    // syntax :
    // (params) -> exp / satements {block}

    // when the return keyword is not explicitly defined then conider the coutpmatic return in that case

//    // A lambda expression with no parameters
//() -> System.out.println("Hello, World!")
//
//// A lambda expression with one parameter
//    x -> x * x
//
//// A lambda expression with multiple parameters
//    (x, y) -> x + y
//
//// A lambda expression with a block of code
//    (x, y) -> {
//        int sum = x + y;
//        return sum;
//    }

    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void add() {
                System.out.println("this is in add method");
            }
        };

        test.add();
    }

    //         names.forEach(name -> System.out.println(name)); itrating over collections

    

}
