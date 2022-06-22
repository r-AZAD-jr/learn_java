package com.learnjava.organized;

public class CargoFlight extends Flight{

    private double totalSpaceAvailable;
    private double currentSpaceOccupied;

    {
        totalSpaceAvailable = 1000d;
        currentSpaceOccupied = 0;
    }

    public CargoFlight(){
    }

    public void addPackage(double length, double height, double weight)
    {
        var packageVolume = length * height * weight;
        if(hasSpace(packageVolume))
            currentSpaceOccupied += packageVolume;
        else
            handleNoSpace();
    }

    private void handleNoSpace() {
        System.out.println("No Space Available !!");
    }

    private boolean hasSpace(double packageVolume) {
        return currentSpaceOccupied + packageVolume <= totalSpaceAvailable;
    }

    public void printCargoFlightInfo() {
        /**
         * Calling public method from Flight Class.
         * */
        printFlightInfo();
        System.out.println("Available Space             : " + (totalSpaceAvailable - currentSpaceOccupied) + " !!");
        System.out.println("Current Occupied Space      : " + currentSpaceOccupied + " !!");
    }
}
