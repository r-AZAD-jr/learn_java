package com.learnjava.organized;

public class Flight {
    public int passenger = 100;

    public int getPassenger() {
        return passenger;
    }

    public void addPassenger() {
        System.out.println("Number of Passenger : " + getPassenger() + " !!");
    }
}
