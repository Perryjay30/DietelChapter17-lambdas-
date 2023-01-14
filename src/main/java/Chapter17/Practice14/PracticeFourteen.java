package Chapter17.Practice14;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class PracticeFourteen {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 13, 45, 15, 16, 7);
        var result = list.stream()
                .peek(System.out::print)
                .toList();
        System.out.println(result);


        //skip
        List<String> words = List.of("AAA", "BBB", "BCCD", "HELLO!");
        words.stream().skip(2).
                forEach(System.out::println);

        //sorted
        var sortedList = list.stream()
                .sorted()
                .collect(toList());
        System.out.println(sortedList);

        var sortedInDescendingOrder = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(toList());
        System.out.println(sortedInDescendingOrder);

        //findAny
        var res = list.stream()
                .filter(x -> x % 2 != 0)
                .findAny()
                .orElse(-1);
        System.out.println(res);

        //min
        Optional<Integer> optionalMin = list.stream().min(Comparator.naturalOrder());
        int minimum = optionalMin.orElse(-1);
        System.out.println(minimum);

        //reduce
        var res1 = list.stream()
                .filter(i -> i > 0)
                .reduce((i,j) -> (i + j)).orElse(-1)  / list.size();
        System.out.println(res1);


        System.out.println(list.stream()
                .flatMapToInt(IntStream::of)
                .summaryStatistics());

//        System.out.println(list.stream().count());
    }
}
