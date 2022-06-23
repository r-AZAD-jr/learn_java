package com.learnjava.organized;

public interface MathProcessing {
    String SEPERATOR = " ";
    boolean matchOperation(String operationType);
    double calculate(double leftVal, double rightVal);
}
