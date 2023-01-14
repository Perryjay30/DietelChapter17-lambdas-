package Chapter17.Practice7;

import java.util.List;

public class PracticeSeven {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 22, 3, 4, 5, 3, 7, 8, 9, 2);
        list.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
