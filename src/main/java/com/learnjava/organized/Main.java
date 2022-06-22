package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        print();

        int age = 20;
        print(age);
        
        short jrAge = 1;
        /**
         * implicit widening done by compiler
         * */
        print(jrAge);

        int msAge = 20;
        String msName = "love";
        print(msAge,msName);
    }

    private static void print(int msAge, String msName) {
        System.out.println("Ms age is : " + msAge + ", Ms name is : " + msName);
    }

    private static void print(int age) {
        System.out.println("Age is : " + age);
    }

    private static void print() {
        System.out.println("Inside Print !!");
    }
}