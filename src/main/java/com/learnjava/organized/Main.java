package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {

        /**
         * Object is extended with every class
         * Object act as a base class that's
         * why we can assign any class instance
         * to Object reference
         * */

        /**
         * Any object array can point to different
         * instance of class.
         * */
        Object[] objRefArray = new Object[2];
        objRefArray[0] = new CargoFlight();
        objRefArray[1] = new Flight();

        /**
         * Object can point to array. Because Array
         * is class in java.
         * */
        Object objRef = new Flight();
        objRef = new CargoFlight[2];


        Object objCargoFlight = new CargoFlight();
        Object objFlight = new CargoFlight();

        CargoFlight objCargoFlight2 = null;
        if(objCargoFlight instanceof CargoFlight)
            objCargoFlight2 = (CargoFlight)objCargoFlight;

        Flight objFlight2 = null;
        if(objFlight instanceof Flight)
            objFlight2 = (Flight)objFlight;

        System.out.println("Cargo Flight Passenger  : " + objCargoFlight2.getPassenger() + " !!");
        System.out.println("Flight Flight Passenger : " + objFlight2.getPassenger() + " !!");

        objCargoFlight2.addPassenger();
        objFlight2.addPassenger();
    }
}