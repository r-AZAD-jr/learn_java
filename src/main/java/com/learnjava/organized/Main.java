package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        CargoFlight objCargoFlight = new CargoFlight();
        Flight objFlight = new CargoFlight();

        System.out.println("Cargo Flight Passenger  : " + objCargoFlight.passenger + " !!");
        System.out.println("Flight Flight Passenger : " + objFlight.passenger + " !!");

        /**
         * Field Hiding
         * Concept:
         * 1. If base and derived class both has same filed.
         * The field is the derived class will hide the base class
         * filed. From line 12 and 13 it seems ok, but it is really
         * not. Line 24 and 25 shows the actual problem. Because
         * the method implementation is in base class it will take
         * field of the base class.
         *
         * 2. If the implementation is in derived class, it will
         * take implementation from the derived class.
         *
         * Note : Fields(variables) in class are reference specific.
         * */
        objCargoFlight.addPassenger(3);
        objFlight.addPassenger(5);
    }
}