package Exercise17_14;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

public class SortingPhoneDirectory {
    public static void main(String[] args) throws IOException {
                Files.lines(Paths.get("C:\\Users\\user\\DietelChapter17" +
                                "\\src\\main\\java\\Exercise17_14\\PhoneDirectory"))
                .toList().stream().sorted()
                        .distinct().forEach(System.out::println);
        System.out.println();
    }
}
