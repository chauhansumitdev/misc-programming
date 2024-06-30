package com.example.enums;

public class Main {

    public static void main(String[] args) {
        Names name = Names.E;

        if(name != name.A){
            System.out.println("no idea");
        }

        System.out.println(name);

        Names newName = Names.E;
        System.out.println(newName.getPriority());
    }
}

enum Names{
    A(4),E(1);


    // there are all self object of this Names only so we can add more mehtods define constructors etc
    private int priority;
    Names(int priority){
        this.priority=priority;
    }

    int getPriority(){
        return priority;
    }
}
