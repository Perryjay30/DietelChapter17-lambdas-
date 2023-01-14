package Chapter17.Practice5;

import java.util.stream.Stream;

public class PracticeFive {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream.of(1,2,3,4,5,6);

        nums.map((num) -> num * num)
                .forEach((num) -> System.out.println(num));
    }
}
