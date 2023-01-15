package Exercise17_12;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainInvoice {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice("83", "Electric sander", 7, 57.98),
                new Invoice("24", "Power saw", 18, 99.99),
                new Invoice("7", "Sledge Hammer", 11, 21.50),
                new Invoice("77", "Hammer", 76, 11.99),
                new Invoice("39", "Lawn Mower", 3, 79.50),
                new Invoice("68", "Screw Driver", 106,6.99),
                new Invoice("56", "Jig saw", 21, 11.00),
                new Invoice("3", "Wrench", 34, 7.50)
        };

        //a
        List<Invoice> list = Arrays.asList(invoices);
        System.out.println("ALL INVOICES");
        list.stream()
                .sorted(Comparator.comparing(Invoice::getPricePerItem))
                //b
                .sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);
        //c
        Function<Invoice, String> byDescription = Invoice::getPartDescription;
        Function<Invoice, Integer> byQuantity = Invoice::getQuantity;

        Comparator<Invoice> desQuan = Comparator.comparing(byDescription).thenComparing(byQuantity);
        System.out.println();
        System.out.println("The invoice part description and quantity");
        list.stream()
                .map(Invoice::getQuanDes)
                .sorted()
                .forEach(System.out::println);

        //d
        System.out.println();
        System.out.println("The invoice part description and value");
        list.stream()
                .map(Invoice::getInvoiceValue)
                .sorted()
                .forEach(System.out::println);

        //e
        Predicate<Invoice> twoToFiveHundred = invoice -> (invoice.priceAndQuantity() >= 200 && invoice.priceAndQuantity() <= 500);
        System.out.println();
        System.out.println("The invoice part description and value within the range of $200 to $500");
        list.stream()
                .filter(twoToFiveHundred)
                .map(Invoice::getInvoiceValue)
                .forEach(System.out::println);
        //f
        Predicate<Invoice> shouldContainSaw = voice -> (voice.getPartDescription().contains("saw"));
        System.out.println();
        System.out.print("The invoice part description that contains the word 'saw': ");
        System.out.println(list.stream().anyMatch(shouldContainSaw));

    }
}
