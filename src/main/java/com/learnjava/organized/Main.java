package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        if(args.length > 0)
            printArgs(args);
    }

    private static void printArgs(String[] args) {
        char firstArgs      =   args[0].charAt(0);
        double secondArgs   =   Double.parseDouble(args[1]);
        double thirdArgs    =   Double.parseDouble(args[2]);

        System.out.println("First Args : " + firstArgs);
        System.out.println("Second Args : " + secondArgs);
        System.out.println("third Args : " + thirdArgs);
    }
}