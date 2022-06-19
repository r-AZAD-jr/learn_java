package com.learnjava.organized;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        handleWorkFlow(args);
    }

    private static void handleWorkFlow(String[] args) {
        int result = args.length > 0 ? handleArgs(args[0]) : handleUserInput();
        System.out.println("Number is : " + result);
    }

    private static int handleUserInput() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print( "Enter a Number : " );
        return Integer.parseInt(scannerObj.nextLine());
    }

    private static int handleArgs(String args) {
        String[] stringArray = {
                "zero",
                "one",
                "two",
                "three"
        };

        var listOfStringArray = Arrays.asList(stringArray);
        return listOfStringArray.contains(args) ? listOfStringArray.indexOf(args) : -1;
    }
}