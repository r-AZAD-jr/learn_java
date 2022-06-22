package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {
        Flight fxd1 = new Flight();
        fxd1.addPassenger(3);
        fxd1.printFlightInfo();

        Flight fxd2 = new Flight();
        fxd2.addPassenger(4);
        fxd2.printFlightInfo();

        swapReference(fxd1, fxd2);
        System.out.println("\nAfter Swap Reference !!");
        fxd1.printFlightInfo();
        fxd2.printFlightInfo();

        swapSeatsAvailable(fxd1,fxd2);
        System.out.println("\nAfter Changing object instance member !!");
        fxd1.printFlightInfo();
        fxd2.printFlightInfo();
    }

    /**
     * Swap Reference will not work.
     * Because fxd1 and fxd2 both are
     * local variable to this method.
     * Any changes to this reference
     * itself is local as well.
     * */
    private static void swapReference(Flight fxd1, Flight fxd2) {
        Flight tempObj = fxd1;
        fxd1 = fxd2;
        fxd2 = tempObj;
    }

    /**
     * We are changing the content of
     * the object. If changing object
     * content this is visible in method
     * as well as outside the method as well.
     * */
    private static void swapSeatsAvailable(Flight fxd1, Flight fxd2) {
        int fxd1Seats = fxd1.getSeats();
        fxd1.setSeats(fxd2.getSeats());
        fxd2.setSeats(fxd1Seats);
    }
}