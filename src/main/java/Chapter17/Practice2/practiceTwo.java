package Chapter17.Practice2;

import java.util.List;

public class practiceTwo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4, 5, 6, 7, 8, 9);
        var result = numbers.stream()
                .map((n) -> n *2)//2, 4, 8, 10,12, 14, 16, 18
                .reduce(0, (i,j) -> i+j);//
        System.out.println(result);
    }
}
