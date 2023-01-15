package Exercise17_13;

import java.security.SecureRandom;
import java.util.OptionalDouble;


public class AverageOfOddAndEvenNumbers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        long randIntEven = randomNumbers.ints(10, 1, 1000)
                .filter((num) -> num % 2 == 0)
                .count();
        System.out.println("The Even numbers there are " + randIntEven);

        OptionalDouble randIntEvenAverage = randomNumbers.ints(10, 1, 1000)
                .filter((num) -> num % 2 == 0)
                .average();
        System.out.println("The Average even numbers there are " + randIntEvenAverage);

        long randIntOdd = randomNumbers.ints(10, 1, 1000)
                .filter((odd) -> odd % 2 != 0)
                .count();
        System.out.println("The Odd numbers there are " + randIntOdd);

        OptionalDouble randIntOddAverage = randomNumbers.ints(10, 1, 1000)
                .filter((odd) -> odd % 2 != 0)
                .average();
        System.out.println("The Average odd numbers there are " + randIntOddAverage);

        OptionalDouble randIntAverage = randomNumbers.ints(10, 1, 1000)
                .average();
        System.out.println("The Average of the numbers there are " + randIntAverage);


    }
}
