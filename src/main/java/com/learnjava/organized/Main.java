package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        CargoFlight objRefCargoFlight = new CargoFlight();
        System.out.format("Missing Flight, %s !!",objRefCargoFlight.getFlightName());
    }
}