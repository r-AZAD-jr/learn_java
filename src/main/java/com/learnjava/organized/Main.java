package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        Flight[] referenceFlight = new Flight[2];
        referenceFlight[0] = new Flight();
        referenceFlight[1] = new Flight();

        referenceFlight[0].addPassenger(2);
        System.out.println("Current Number of Passenger on flight 1 : " + referenceFlight[0].getPassenger());

        referenceFlight[1].addPassenger(190);
        System.out.println("Current Number of Passenger on flight 2 : " + referenceFlight[1].getPassenger());
    }

}