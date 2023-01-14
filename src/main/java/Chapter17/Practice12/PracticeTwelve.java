package Chapter17.Practice12;

import java.util.stream.Stream;

public class PracticeTwelve {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2,3,4,5,6,7,8);
        int number = stream.findAny()
                .orElseGet(() -> -1);
        System.out.println(number);
    }
}
