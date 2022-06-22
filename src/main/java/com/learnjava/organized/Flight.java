package com.learnjava.organized;

public class Flight {
    private int passenger;
    private int seats;

    public Flight() {
        passenger = 100;
        seats = 0;
    }

    public void addPassenger(int newPassenger) {
        if (passenger <= passenger + newPassenger)
            this.seats += newPassenger;
        else
            handleWarning();
    }

    private void handleWarning() {
        System.out.println("Not Enough Seats Available !!");
    }

    public void printFlightInfo() {
        System.out.println("Number of Occupied Seats    : " + seats + " !!");
        System.out.println("Number of Seats Available   : " + (passenger-seats) + " !!");
    }
}
