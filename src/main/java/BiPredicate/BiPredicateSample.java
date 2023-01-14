package BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (number, word) -> word.length() == number;
        boolean result = biPredicate.test(5, "Overdose");
        System.out.println(result);
    }
}
