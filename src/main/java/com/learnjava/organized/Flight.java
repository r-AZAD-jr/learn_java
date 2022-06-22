package com.learnjava.organized;

public class Flight {
    private int passenger;
    private int seats;

    public int getSeats()
    {
        return seats;
    }
    public void setSeats(int seats)
    {
        this.seats=seats;
    }

    public Flight() {
        passenger = 10;
    }

    public void addPassenger(int newPassenger) {
        if (passenger <= passenger + newPassenger)
            seats += newPassenger;
        else
            handleWarning();
    }

    private void handleWarning() {
        System.out.println("Not Enough Seats Available !!");
    }

    public void printFlightInfo() {
        System.out.println("Number of passenger        : " + seats);
        System.out.println("Number of seats available  : " + (passenger - seats));
    }
}
