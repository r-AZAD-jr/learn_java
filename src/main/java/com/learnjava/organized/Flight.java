package com.learnjava.organized;

public class Flight implements Comparable<Flight>{
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
    public int compareTo(Flight o) {
        int orderResult = flightPriority - o.flightPriority;
        if (orderResult == 0)
            orderResult = (int)(o.flightDelayTime - flightDelayTime);
        return orderResult;
    }
}
