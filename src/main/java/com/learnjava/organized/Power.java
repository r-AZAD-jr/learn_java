package com.learnjava.organized;

public class Power implements MathProcessing {

    private String formattedCommand;

    @Override
    public boolean matchOperation(String operationType) {
        return operationType.equalsIgnoreCase("power");
    }

    @Override
    public String getCommandInfo() {
        return formattedCommand;
    }

    @Override
    public double calculate(double leftVal, double rightVal) {
        formattedCommand = "Left Value : " + leftVal + ", Right Value : " + rightVal + " !!";
        return Math.pow(leftVal, rightVal);
    }
}
