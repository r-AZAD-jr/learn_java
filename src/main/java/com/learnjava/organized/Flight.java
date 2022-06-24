package com.learnjava.organized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Flight {
    private ArrayList<Passenger> objPassengerArrayList = new ArrayList<>();

    public void addNewPassenger(String name, int userLevel, int memberOfDays) {
        objPassengerArrayList.add(new Passenger(name, userLevel, memberOfDays));
    }

    public Iterable<Passenger> getSortedPassengerList() {
        /**
         * Anonymous class.
         * */
        return new Iterable<>() {
            @Override
            public Iterator<Passenger> iterator() {
                Passenger[] objPassengerArray = new Passenger[objPassengerArrayList.size()];
                objPassengerArrayList.toArray(objPassengerArray);
                Arrays.sort(objPassengerArray);
                return Arrays.asList(objPassengerArray).iterator();
            }
        };
    }
}