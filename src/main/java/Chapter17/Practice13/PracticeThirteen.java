package Chapter17.Practice13;

import java.util.List;
import java.util.stream.Stream;

public class PracticeThirteen {
    public static void main(String[] args) {
        List<String> sequence = List.of("AAABC", "GBTRESX", "ASDFG", "QWERTY");
        sequence.stream().
                flatMap((seq) -> Stream.of(seq.length())).
                forEach(System.out::println);
    }
}
