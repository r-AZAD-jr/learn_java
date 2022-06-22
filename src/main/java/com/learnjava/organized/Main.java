package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {

        Object objRefFlight = new Flight();

        Object objRefCargoFlight = new CargoFlight[2];
        Object objRefFlight2 = new Flight();

        boolean result1 = objRefFlight2.equals(objRefFlight);
        boolean result2 = objRefFlight2.equals(objRefCargoFlight);

        System.out.println("Is instance same : " + result1);
        System.out.println("Is instance same : " + result2);
    }
}