package com.learnjava.organized;

import java.util.Locale;

public class Add implements MathProcessing {
    @Override
    public boolean matchOperation(String operationType) {
        return operationType.equalsIgnoreCase("add");
    }

    @Override
    public double calculate(double leftVal, double rightVal) {
        return leftVal + rightVal;
    }
}
