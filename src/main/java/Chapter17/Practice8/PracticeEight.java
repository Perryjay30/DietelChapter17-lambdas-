package Chapter17.Practice8;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PracticeEight {
    public static void main(String[] args) {
        List<Woman> womanList = List.of(
            new Woman("Banke", 43),
            new Woman("Jennifer", 90),
            new Woman("Brenda", 32),
            new Woman("Hailey", 24)
        );

        Map<String, Integer> map = new TreeMap<>();

        womanList.stream()
                .map((women) -> map.put(women.getName(), women.getAge()))
                .forEach(System.out::println);

        System.out.println(map);




    }

}
