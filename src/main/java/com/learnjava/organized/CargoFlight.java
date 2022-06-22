package com.learnjava.organized;

public final class CargoFlight extends Flight{
    /**
     * Because CargoFlight extends Flights
     * it provides an implementation for getFlightName()
     * */
    @Override
    public String getFlightName() {
        return "Varig Flight 967";
    }
}
