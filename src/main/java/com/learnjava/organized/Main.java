package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {
        handleFlight();
    }

    private static void handleFlight() {

        HandleCalculation objHandleCalculation = new HandleCalculation(
                new MathProcessing[]{
                        new Add(),
                        new Power()
                }
        );

        String command = "add 2 3";
        var result = objHandleCalculation.calculate(command);
        System.out.println("Calculated Result : " + result + " !!");
    }
}