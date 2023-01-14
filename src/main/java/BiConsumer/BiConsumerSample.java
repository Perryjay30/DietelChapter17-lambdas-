package BiConsumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + "\t\t" + age);
        System.out.println("name\t\tage");
        biConsumer.accept("Rachael", 102);

        Map<String, Integer> mapOfPersons = Map.of(
                "Banke", 42,
                "Tolani", 67,
                "Richard", 78
        );

        mapOfPersons.forEach((name, age)
                -> System.out.println(name + "\t\t" + age));

        mapOfPersons.forEach(biConsumer);
    }
}
