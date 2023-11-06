public class TopTrumpDeck implements Comparable<TopTrumpDeck>{
    private String theme;

    public TopTrumpDeck(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return theme;
    }

    @Override
    public int compareTo(TopTrumpDeck otherTopTrumpDeck) {
        return theme.compareTo(otherTopTrumpDeck.theme);
    }
}
