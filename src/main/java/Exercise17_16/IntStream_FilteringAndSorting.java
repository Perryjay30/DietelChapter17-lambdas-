package Exercise17_16;

import java.security.SecureRandom;

public class IntStream_FilteringAndSorting {
    public static void main(String[] args) {
        SecureRandom rands = new SecureRandom();
        rands.ints(50, 1, 1000)
                .filter((odd) -> odd % 2 != 0)
                .sorted()
                .forEach(System.out::println);
    }
}
