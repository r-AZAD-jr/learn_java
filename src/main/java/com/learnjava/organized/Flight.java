package com.learnjava.organized;

public class Flight {
    private int passenger;
    private static int seats;

    public int getSeats()
    {
        return seats;
    }
    public void setSeats(int seats)
    {
        /**
         * instance member can access instance and static member.
         * */
        Flight.seats = seats;
    }

    public static void resetSeats()
    {
        seats = 0;
        /**
         * passenger = 0; will generate error, cause static method can only access static member
         * */
    }

    {
        passenger = 10;
        seats = 0;
    }

    public Flight() {
    }

    public void addPassenger(int newPassenger) {
        if (passenger <= passenger + newPassenger)
            seats += newPassenger;
        else
            handleWarning();
    }

    private void handleWarning() {
        System.out.println("Not Enough Seats Available !!");
    }

    public void printFlightInfo() {
        System.out.println("Number of passenger        : " + seats);
        System.out.println("Number of seats available  : " + (passenger-seats));
    }
}
