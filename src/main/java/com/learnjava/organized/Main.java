package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        int classLevel          =   9;
        String firstStudent     =   "Billy";
        String secondStudent    =   "Joel";
        print(classLevel, firstStudent, secondStudent);
    }

    /**
     * Only the last variable is allowed to have variable parameters.
     * */
    private static void print(int classLevel, String... studentName) {
        System.out.println("Class Level : " + classLevel + " !!");
        for(short i = 0; i < studentName.length; ++i)
            System.out.format("Student %d, Name %s !!\n", i, studentName[i]);
    }
}