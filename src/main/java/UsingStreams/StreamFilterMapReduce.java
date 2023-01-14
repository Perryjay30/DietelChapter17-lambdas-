package UsingStreams;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {
    public static void main(String... args) {
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0)
                total += i * 3;
        }
        System.out.println(total);

        //instead: Use lambdas
        System.out.println("The sum of the even number multiplied by three is: " + IntStream.rangeClosed(1, 10).
                filter(x -> x % 2 == 0).
                map(x -> x * 3).
                sum());
    }
}
