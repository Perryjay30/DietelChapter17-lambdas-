package Chapter17.Practice11;

import java.util.List;

public class PracticeEleven {
    public static void main(String[] args) {
        List<String> list = List.of("Tom", "Mickey", " Jerry", "Donald");
//        Stream<integer> stream = Stream.of(2,3,4,5,6,7,8);
//        stream.findAny()
//                .orElseGet(() -> -1);
//        System.out.println();


        var name = list.stream()
                .findFirst()
                .orElse("-1");
        System.out.println(name);
    }
}
