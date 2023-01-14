package Chapter17.Practice4;

import java.util.List;

public class PracticeFour {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5);
        numbers.stream()
                .mapToInt((n) -> n + 1)
                .mapToObj((n) -> n)//autoboxing
//                .forEach((n) -> System.out.println(n))
                .forEach(System.out::println);//:: method referencing
    }
}
