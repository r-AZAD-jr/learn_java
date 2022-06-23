package com.learnjava.organized;

public class HandleCalculation {
    MathProcessing[] objMathProcessingArray = null;

    public HandleCalculation(MathProcessing[] objMathProcessingArray) {
        this.objMathProcessingArray = objMathProcessingArray;
    }

    public double calculate(String command) {
        double result = 0;
        String[] splittedCommand = command.split(MathProcessing.SEPERATOR);
        String commandKey = splittedCommand[0];
        double leftVal = Double.parseDouble(splittedCommand[1]);
        double rightVal = Double.parseDouble(splittedCommand[2]);

        for (var Item : objMathProcessingArray) {
            if (Item.matchOperation(commandKey)) {
                result = Item.calculate(leftVal, rightVal);
                break;
            }
        }

        return result;
    }

}
