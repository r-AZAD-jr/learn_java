package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        Flight fxd1 = new Flight();
        fxd1.addPassenger(1,0);
        fxd1.addPassenger(2,1);
        fxd1.addPassenger(3,0);
        fxd1.printFlightInfo();
    }
}