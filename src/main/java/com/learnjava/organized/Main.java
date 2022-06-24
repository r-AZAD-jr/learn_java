package com.learnjava.organized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        Collection<Passenger> objArrayPassenger = new ArrayList<>();
        Passenger objPassenger1 = new Passenger("Mark", 3, 600);
        Passenger objPassenger2 = new Passenger("Mat", 2, 100);
        Passenger objPassenger3 = new Passenger("Missy", 1, 10);
        Passenger objPassenger4 = new Passenger("Richard", 2, 200);

        Collection<Passenger> objArrayPassenger2 = new ArrayList<>();
        objArrayPassenger2.add(objPassenger1);
        objArrayPassenger2.add(objPassenger2);
        objArrayPassenger2.add(objPassenger3);

        objArrayPassenger.addAll(objArrayPassenger2);
        objArrayPassenger.add(objPassenger4);

        System.out.println("First Array Object : " + objArrayPassenger.size() + " !!");

        /**
         * Removing Item from List is not possible with foreach
         * */
        for(var Item : objArrayPassenger2)
            System.out.println("Second Array By element : " + Item + " !!");

        /**
         * This is more conventional way to iterate through connection in java !!
         * */
        Iterator<Passenger> objIterable = objArrayPassenger.iterator();
        while (objIterable.hasNext()){
            Passenger objPassenger = objIterable.next();
            if(objPassenger.getUserLevel() > 2)
            {
                objIterable.remove();
            }
        }
        System.out.println("First Array Object : " + objArrayPassenger.size() + " !!");
    }
}