package com.learnjava.organized;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }
    private static void handleFlight() {
        Flight[] objFlightArray = {
                new Flight(10.5d , 1, "Air Force One"),
                new Flight(11.5d , 2, "Air Force One Backup 1"),
                new Flight(13.5d , 2, "Air Force One Backup 2"),
                new Flight(15.5d , 2, "Air Force One Backup 3"),
                new Flight(12.5d , 4, "Air Force One Decoy 1"),
                new Flight(10d   , 5, "Air Force One Decoy 2")
        };

        Arrays.sort(objFlightArray);
        for (var obj : objFlightArray)
            System.out.format("Flight Name : %s, Priority : %d, Waiting Time : %f !!\n",
                    obj.getFlightName(), obj.getFlightPriority(), obj.getFlightDelayTime() );
    }
}