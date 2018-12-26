package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.calculateExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.calculateExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.calculateExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.calculateExpression(10, 5, (a, b) -> a / b);
    }
}
