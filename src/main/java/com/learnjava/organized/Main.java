package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        FlightCrew objEnumPilot = FlightCrew.PILOT;
        FlightCrew objEnumCoPilot = FlightCrew.COPILOT;

        System.out.println("Object Enum of Pilot    : " + objEnumPilot);
        System.out.println("Object Enum of CoPilot  : " + objEnumCoPilot);

        /**
         * If left >right : 0
         * If left >right : 1
         * If left >right : -1
         * */
        int result = objEnumCoPilot.compareTo(objEnumCoPilot);
        System.out.println("Is Pilot is bigger then CoPilot : " + result + " !!");

        int pilotVal = objEnumCoPilot.getField();
        System.out.println("Pilot enum Value : " + pilotVal + " !!");

        compareJob(objEnumPilot);
    }

    private static void compareJob(FlightCrew objEnum) {
        /**
         * No need to qualify with complete name
         * Eg : FlightCrew.CREW is not necessary.
         * only CREW is enough.
         * */
        switch (objEnum) {
            case CREW:
                System.out.println("Job of Crew is to maintain the plain !!");
                break;
            case PILOT:
                System.out.println("Job of Pilot is Fly the Plain !!");
                break;
            case COPILOT:
                System.out.println("Job of CoPilot is to help Fly the Plain !!");
                break;
        }
    }
}