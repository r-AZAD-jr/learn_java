package com.learnjava.organized;

import java.util.ArrayList;

public class Passenger implements Comparable<Passenger> {

    private String name;
    private int userLevel;
    private int memberOfDays;

    public String getName() {
        return name;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public int getMemberOfDays() {
        return memberOfDays;
    }

    public Passenger() {
    }

    public Passenger(String name, int userLevel, int memberOfDays) {
        this.name = name;
        this.userLevel = userLevel;
        this.memberOfDays = memberOfDays;
    }

    /**
     * This nested class is mainly used
     * to have a name scope of the enclosed
     * class. In this case to specify
     * Reward class Passenger.Reward has to
     * be used.
     * <p>
     * It is possible to use this nested class
     * instance inside the enclosed class. As
     * well as outside as well. Because this
     * nested class Reward is treated as a member
     * of enclose class Passenger, nested class
     * Reward have complete access to
     * <p>
     * Default(private),
     * public,
     * private
     * all access modifiers.
     */
    public static class Reward {
        public int userLevel;
    }

    /**
     * This is an inner class
     * object creation is
     * directly associated with
     * it's enclosing class.
     * <p>
     * Note inner class does not have static keyword
     */
    private class Advert {
        private String recentAdvertisements = "top price";

        public String getRecentAdvertisements() {
            return recentAdvertisements;
        }
    }

    public String getTopPrice() {
        Advert objAdvert = new Advert();
        return objAdvert.getRecentAdvertisements();
    }

    @Override
    public int compareTo(Passenger passenger) {
        int result = this.userLevel - passenger.userLevel;
        return result == 0 ? passenger.memberOfDays - this.memberOfDays : result;
    }
}
