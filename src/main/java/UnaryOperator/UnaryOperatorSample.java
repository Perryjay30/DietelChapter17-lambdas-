package UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (number) -> number * number;
        Integer result = unaryOperator.apply(10);
        System.out.println(result);
    }
}
