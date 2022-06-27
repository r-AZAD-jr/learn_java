package com.learnjava.organized;

public class Passenger {
    private String passengerName;
    private int userLevel;
    private int userFor;
    public String getPassengerName() {
        return passengerName;
    }
    public Passenger(String passengerName, int userLevel, int userFor) {
        this.passengerName = passengerName;
        this.userLevel = userLevel;
        this.userFor = userFor;
    }
}
