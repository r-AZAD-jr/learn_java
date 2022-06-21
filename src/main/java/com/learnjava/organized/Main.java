package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        Flight fxd1 = new Flight();
        fxd1.addPassenger(3);
        fxd1.setSeats(7);
        fxd1.printFlightInfo();
    }
}