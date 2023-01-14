package BiFunction;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
//        BiFunction<String, String, String> biFunction = (firstNumber, secondNumber) -> firstNumber + "" + secondNumber;
//        String answer = biFunction.apply("1", "0");
//        System.out.println(answer);
        BiFunction<String, String, Integer> biFunction = (firstNumber, secondNumber)
                -> Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        Integer answer = biFunction.apply("1", "5");
        System.out.println(answer);
    }
}
