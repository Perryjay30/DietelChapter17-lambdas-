package BinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
//        BinaryOperator<Integer> binaryOperator = (number, number2) -> (number * number2);
//        System.out.println(binaryOperator.apply(30, 9));

        DoubleBinaryOperator doubleBinaryOperator = (num1, num2) -> num1 * num2;
        double result = doubleBinaryOperator.applyAsDouble(42.15, 65.36);
        System.out.println(result);
    }
}
