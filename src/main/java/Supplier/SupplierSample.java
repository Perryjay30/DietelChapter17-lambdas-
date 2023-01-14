package Supplier;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "I love Java Programming Language";
        System.out.println(supplier.get());
    }
}
