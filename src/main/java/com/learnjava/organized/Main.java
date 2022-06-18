package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {

        /**
         * Logical Operator
         * &
         * |
         * ^
         * !
         * */

        /**
         * Conditional Logical Operator
         * &&
         * ||
         * */
        /**
         * Main difference Between Conditional
         * logical operator and logical operator
         * is,
         *
         * CONDITIONAL logical operator
         *
         * || if the first condition
         * becomes true it will not check
         * the rest of them. If the first
         * condition becomes false only then
         * it will check the rest of them.
         * If any condition becomes true
         * ti will not check the rest.
         *
         * && if the first condition
         * becomes true only then it will
         * check the rest of them. If any
         * of them becomes false it will
         * not check the rest of them.
         *
         * In LOGICAL operator it will
         * check all the condition despite
         * it is true of False
         * */

        boolean booleanVar1 = true;
        boolean booleanVar2 = false;
        boolean booleanVar3 = true;

        // Logical Operator will check all the variables
        boolean result1 = booleanVar1 & booleanVar2 & booleanVar3;

        // Conditional Logical Operator when finds booleanVar1 true
        // it will not check the rest of them. It will return true
        boolean result2 = booleanVar1 || booleanVar2 || booleanVar3;

        // Conditional Logical Operator when finds booleanVar1 true
        // it will check the rest of them. It booleanVar2 is true
        // it will check booleanVar3. If any of them becomes false
        // it will not check the rest of it.
        boolean result3 = booleanVar1 && booleanVar2 && booleanVar3;
    }
}