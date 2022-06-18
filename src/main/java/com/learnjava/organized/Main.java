package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {

        byte counter = 1;
        while (counter < 10) {
            System.out.println("While Counter : " + counter);
            counter *= 2;
        }

        counter = 1;
        do {
            System.out.println("Do While Counter : " + counter);
            counter *= 2;
        }
        while (counter <= 1);

        for (int i = 1; i < 10; i *= 2)
            System.out.println("For loop I : " + i);

        double[] doubleArray = {10.1d,20.2d,30.3d};
        System.out.print("Array : ");
        for(var Item : doubleArray)
            System.out.print(Item + " ");
    }
}