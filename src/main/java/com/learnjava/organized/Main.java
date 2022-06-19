package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {

        String firstString  = "piano man";
        String secondString = "piano";
        String thirdString = secondString + " man";

        boolean result1 = firstString == thirdString;
        boolean result2 = firstString.equals(thirdString);
        boolean result3 = firstString.intern() == thirdString.intern();

        System.out.println( "firstString     : " + System.identityHashCode(firstString) );
        System.out.println( "thirdString     : " + System.identityHashCode(thirdString) );

        System.out.println( "Equality    : " + result1 );
        System.out.println( "Equal       : " + result2 );
        System.out.println( "Intern      : " + result3 );
    }
}