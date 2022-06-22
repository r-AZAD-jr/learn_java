package com.learnjava.organized;

public class Flight {
    @Override
    public boolean equals(Object o)
    {
        return o instanceof Flight;
    }
}
