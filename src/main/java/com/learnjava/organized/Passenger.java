package com.learnjava.organized;

public class Passenger {

    /**
     * This nested class is mainly used
     * to have a name scope of the enclosed
     * class. In this case to specify
     * Reward class Passenger.Reward has to
     * be used.
     *
     * It is possible to use this nested class
     * instance inside the enclosed class. As
     * well as outside as well. Because this
     * nested class Reward is treated as a member
     * of enclose class Passenger, nested class
     * Reward have complete access to
     *
     * Default(private),
     * public,
     * private
     * all access modifiers.
     *
     * */
    public static class Reward{
        public int userLevel;
    }

}
