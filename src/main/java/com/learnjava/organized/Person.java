package com.learnjava.organized;

public class Person {
    private double perBagFee = Math.round(49.99f);

    public double getPerBagFee(){
        return this.perBagFee;
    }

    public Person() {
    }
    public Person(int passengerClass) {
        this(passengerClass > 0 ? 25.0d : 50.0d);
    }
    private Person(double perBagFee){
        this.perBagFee = perBagFee;
    }

    public void printPersonInfo(){
        System.out.println("Fee Per Bag  : " + this.perBagFee);
    }
}
