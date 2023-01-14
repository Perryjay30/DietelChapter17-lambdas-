package Predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word) -> word.length() == 5;
        boolean result = predicate.test("Overdose");
//        System.out.println(result);

        List<Person> people = List.of(
                new Person("Perry", 26),
                new Person("Donald", 19),
                new Person("Holland", 24),
                new Person("Wayne", 30)
        );

        people.stream().filter((person -> person.getAge() <= 30)).forEach(person -> System.out.println(person));
    }
}
