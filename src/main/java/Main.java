import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<TopTrumpDeck> decks = new ArrayList<>();

        decks.add(new TopTrumpDeck("Sports cars"));
        decks.add( new TopTrumpDeck("Dinosaurs"));
        decks.add(new TopTrumpDeck("Dogs"));

        Collections.sort(decks);
    }
}
