package UsingFunctionalInrterface;

import java.util.HashMap;
import java.util.Map;

public class InstrumentApp {
    public static void main(String[] args) {
        Instrument instrumentals = equipment -> {
            System.out.println("I played the " + equipment);
            System.out.println("The guitar man can also play the " + equipment);
        };
        instrumentals.play("Violin");
        System.out.println(Instrument.numberOfSongs());


        Instrument instrument = equipment -> System.out.println("I played the " + equipment);
        Instrument instrument1 = comic -> System.out.println("I love software programming");
        Map<Instrument, Integer> myMap = new HashMap<>();
        myMap.put(instrument, 4);
        myMap.put(instrument1, 541);
        System.out.println(myMap.values());
    }
}
