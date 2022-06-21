package com.learnjava.organized;

/**
 * If we want to import all static members
 * Flight.* can be used to import all.
 * */
import static com.learnjava.organized.Flight.resetSeats;
public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        Flight fxd1 = new Flight();
        fxd1.addPassenger(3);
        fxd1.setSeats(7);
        fxd1.printFlightInfo();

        /**
         * Because of static import we don't need class name to qualify this method call
         */
        resetSeats();

        fxd1.printFlightInfo();
    }
}