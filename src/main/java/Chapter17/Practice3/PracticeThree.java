package Chapter17.Practice3;

import java.util.List;

public class PracticeThree {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 5, 6);
        System.out.println(numbers.stream()
                .mapToInt((n) -> n * 2)
                .sum());
    }
}
