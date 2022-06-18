package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {

        float floatVal = 10.5f;
        double doubleVal = 10.5d;
        byte byteVal = 10;
        short shortVal = 10;
        int intVal = 10;
        long longVal = 10L;

        // Narrowing Conversion is not safe.
        // Be careful when do so !!
        byte byteVal2 = (byte) intVal;

        // Widening Conversion is ok.
        // Implicit conversion.
        long longVal2 = intVal;

        System.out.println("Success !!");
    }
}