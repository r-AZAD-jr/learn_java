package com.learnjava.organized;

public class Flight {

    /**
     * Because getFlightName() is marked final,
     * any class inherit Flight will not be
     * able to override this method.
     * */
    public final String getFlightName()
    {
        return "Star Dust";
    }
}
