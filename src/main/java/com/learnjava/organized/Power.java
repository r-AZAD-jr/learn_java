package com.learnjava.organized;

public class Power implements MathProcessing {

    @Override
    public boolean matchOperation(String operationType) {
        return operationType.equalsIgnoreCase("power");
    }

    @Override
    public double calculate(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
