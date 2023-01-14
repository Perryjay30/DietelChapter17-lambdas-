package Chapter17.Practice15;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeFifteen {
    public static void main(String[] args) {
        List<String> words = List.of("QWERTY", "ASDFGH", "ZXCVBNBM", "POIUJHGF", "ASDFGH", "QWERTY");

        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap((str) -> str, (str) -> str.length(), (a,b) -> a + b, TreeMap::new));
        System.out.println(map);



        Stream<Integer> nums = Stream.of(1, 25, 3, 74, 5, 3, 45);
        Set<Integer> set = nums
                .collect(Collectors.toSet());
        System.out.println("Set -> " + set);



        Stream<String> names = Stream.of("David", "Allison", "Alex");
        List<String> list = names.toList();
        System.out.println("List -> "+ list);

    }
}
