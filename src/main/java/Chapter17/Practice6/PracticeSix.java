package Chapter17.Practice6;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeSix {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("Mavericks", "Rockets" ),
                List.of("Unicorns", "Luminaries"),
                List.of("Mavens", "Tecnophiles")
        );

        var lst = list.stream()
                .flatMap((l) -> l.stream())
                .collect(Collectors.toList());
        System.out.println(lst);

        //List<Woman> women = List.of(
        // new Woman("Banke", 45),
        // new Woman("Brenda", 67),
        // )


        //Map(String, Integer> map = new treeMap<>();

    }

}
