package com.learnjava.organized;

public class Flight implements Comparable {
    private double flightDelayTime;
    private int flightPriority;
    private String flightName;
    public String getFlightName()
    {
        return flightName;
    }
    public double getFlightDelayTime()
    {
        return flightDelayTime;
    }

    public int getFlightPriority()
    {
        return flightPriority;
    }

    public Flight(double flightDelayTime, int flightPriority, String flightName) {
        this.flightDelayTime = flightDelayTime;
        this.flightPriority = flightPriority;
        this.flightName = flightName;
    }

    @Override
    public int compareTo(Object o) {
        Flight objFlight = (Flight) o;
        int orderResult = flightPriority - objFlight.flightPriority;
        if (orderResult == 0)
            orderResult = (int)(objFlight.flightDelayTime - flightDelayTime);
        return orderResult;
    }
}
