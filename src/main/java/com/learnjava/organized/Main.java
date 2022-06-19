package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {

        String name = "What is Name";
        String stringVarName = String.format("Shakespeare said %s ?", name);
        System.out.println(stringVarName);

        int year = 2021;
        String stringVarInYear = String.format("Today is %d !!", year);
        System.out.println(stringVarInYear);

        float ageOfPlanetEarth = 4.543f;
        String stringVarAgeOfPlanetEarth = String.format("Planet Earth  is %f billion years old !!", ageOfPlanetEarth);
        System.out.println(stringVarAgeOfPlanetEarth);

        double distanceFromSun = 1.5e11d;
        String stringVarDistanceFromSun = String.format("Planet Earth  is %e m away from it's host star !!", distanceFromSun);
        System.out.println(stringVarDistanceFromSun);

    }
}