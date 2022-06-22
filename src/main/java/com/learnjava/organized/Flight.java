package com.learnjava.organized;

public class Flight {
    @Override
    public boolean equals(Object o)
    {
        /**
         * super calls method from base class.
         * Even when we override the method
         * in derived class, we can use super
         * to call method from base.
         * */
        if (super.equals(o))
            return true;

        /**
         * Ideally the following check should
         * be done with one of class field member.
         * Here just for understanding instanceof
         * is used.
         * */
        return o instanceof Flight;
    }
}
