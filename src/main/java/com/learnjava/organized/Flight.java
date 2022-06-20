package com.learnjava.organized;

public class Flight {
    private int passenger;
    Person[] objPerson;
    private int seats;

    public Flight() {
        passenger = 100;
        objPerson = new Person[this.passenger];
        seats = 0;
    }

    public void addPassenger(int newPassenger, int passengerClass) {
        if (this.passenger <= this.passenger + newPassenger) {
            if (newPassenger == 1) {
                objPerson[this.seats] = new Person(passengerClass);
            } else {
                for (int i = 0; i < newPassenger; ++i) {
                    objPerson[this.seats + i] = new Person(passengerClass);
                }
            }
            this.seats += newPassenger;
        } else {
            handleWarning();
        }
    }

    private void handleWarning() {
        System.out.println("Not Enough Seats Available !!");
    }

    public void printFlightInfo() {
        System.out.println("Number of Passenger : " + this.passenger);
        for (short i = 0; i < this.seats; ++i) {
            System.out.println("Passenger Number : " + i + " will spend per bag : " + objPerson[i].getPerBagFee() + " !!");
        }
    }

}
