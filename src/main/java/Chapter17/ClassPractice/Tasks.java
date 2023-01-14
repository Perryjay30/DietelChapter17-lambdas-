package Chapter17.ClassPractice;

import java.util.Arrays;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        List<String> intOnly = List.of("wert231", "rytefrg543", "afet578#$%");
        System.out.println(countInteger(intOnly));

        System.out.println(countIntegers(intOnly));

        System.out.println(countingDigits(intOnly));
    }

    private static long countIntegers(List<String> intOnly) {
        return intOnly.stream()
                .reduce("",(i, j) -> i+j)
                .chars().filter(Character::isDigit)
                .count();
    }

    private static int countInteger(List<String> intOnly) {
        int number = 0;

        for (int i = 0; i < intOnly.size(); i++) {
            for (int j = 0; j < intOnly.get(i).length(); j++) {
                if(Character.isDigit(intOnly.get(i).charAt(j)))
                    number += 1;
            }
        }
        return number;
    }

    private static long countingDigits(List<String> words) {
        String digits = "012356789";
       return  words.stream()
                .flatMap((s) -> Arrays.stream(s.split("")))
                .filter(digits::contains)
                .count();
    }
}
