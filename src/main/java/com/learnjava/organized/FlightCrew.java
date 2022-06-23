package com.learnjava.organized;

public enum FlightCrew {
    CREW(1),
    COPILOT(2),
    PILOT(3);

    private int intField;
    public int getField()
    {
        return intField;
    }
    FlightCrew(int intField)
    {
        this.intField = intField;
    }
}
