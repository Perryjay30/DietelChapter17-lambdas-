package Chapter17.Practice1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

//Obtaining streams in java
public class PracticeOne {
    public static void main(String[] args) {
        //1. using the empty factory method from the  stream
        //interface
        Stream<Integer> numberStream = Stream.empty();

        //using the stream utility method of class Arrays
        Integer [] numbers = {2, 4, 5, 6, 7, 8, 9};
        Stream<Integer> integerStream = Arrays.stream(numbers);

        //3. using method generate of class stream
        Stream <Integer> nums = Stream.generate(() -> new Random().nextInt());//infinite stream
        nums.limit(10)
        .forEach((n) -> System.out.println(n));
    }
}
