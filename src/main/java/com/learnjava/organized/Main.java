package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {

        Passenger.Reward objReward = new Passenger.Reward();
        objReward.userLevel = 3;
        System.out.println("User Level : " + objReward.userLevel + " !!");

        Passenger objPassenger = new Passenger();
        System.out.println("Top Add : " + objPassenger.getTopPrice() + " !!");

        Flight objFlight = new Flight();
        objFlight.addNewPassenger("Mark", 3, 600);
        objFlight.addNewPassenger("Mat", 2, 100);
        objFlight.addNewPassenger("Missy", 1, 10);
        objFlight.addNewPassenger("Richard", 2, 200);
        for (var Item : objFlight.getSortedPassengerList())
            System.out.format("Name : %s, Level : %d, Member for : %d !!\n", Item.getName(), Item.getUserLevel(), Item.getMemberOfDays());
    }
}