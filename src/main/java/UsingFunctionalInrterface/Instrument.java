package UsingFunctionalInrterface;

public interface Instrument {
    void play(String equipment);

    static String numberOfSongs() {
        return String.format("The song was sang %.2f times", Math.random() * 200);
    }
}
