package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {

        Passenger.Reward objReward = new Passenger.Reward();
        objReward.userLevel = 3;
        System.out.println("User Level : " + objReward.userLevel + " !!");
    }
}