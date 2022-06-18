package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        int int32bit = 1;
        System.out.println("Prefix : " + ++int32bit);
        int32bit = 1;
        System.out.println("Postfix : " + int32bit++);

        int32bit = 1;
        /**
         * Other Compound Operator
         * +=
         * -=
         * *=
         * /=
         * %=
         * */
        int32bit += 10;
        System.out.println("Compound : " + int32bit);
    }
}