package Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (i) -> System.out.println(i*2);
        consumer.accept(60);


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        numbers.forEach(number -> System.out.println(number + 2));

        System.out.println("Using consumer object directly below");
        numbers.forEach(consumer);
    }
}
