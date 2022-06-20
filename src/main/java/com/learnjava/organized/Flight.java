package com.learnjava.organized;

public class Flight {
    private int passenger;
    private int seats;

    public int getPassenger() {
        return this.passenger;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return this.seats;
    }

    public Flight() {
        this.passenger = 0;
        this.seats = 100;
    }

    public void addPassenger(int numberOfPassenger) {
        if (seats >= this.passenger + numberOfPassenger)
            this.passenger += numberOfPassenger;
        else
            displayWarning();
    }

    private void displayWarning() {
        System.out.println("Not Enough Seats Available !!");
    }

}
