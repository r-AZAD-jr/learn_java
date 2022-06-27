package com.learnjava.organized;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }
    private static void handleFlight() {
        Map<Integer, Passenger> objMap = new HashMap<>();

        objMap.put(1, new Passenger("Mark", 3, 600));
        objMap.put(5, new Passenger("Mat", 2, 100));
        objMap.put(3, new Passenger("Missy", 1, 10));
        objMap.put(4,new Passenger("Richard", 2, 200));

    objMap.forEach((id, value) ->
    {
        System.out.format("ID : %d, Name : %s !!\n", id, value.getPassengerName());
    });
    }
}