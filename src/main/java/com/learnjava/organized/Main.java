package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        CargoFlight objCargoFlight = new CargoFlight();

        /**
         * Calls addCargo in CargoFlight class
         * with object of CargoFlight class
         * */
        objCargoFlight.addPackage(5d, 2d, 5d);
        /**
         * Calls addPassenger in Flight class
         * with object of CargoFlight class
         *  */
        objCargoFlight.addPassenger(3);

        objCargoFlight.printCargoFlightInfo();
    }
}