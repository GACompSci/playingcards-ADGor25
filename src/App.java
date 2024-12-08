public class App {
    public static void main(String[] args) throws Exception {
        // Nested counter loop that creates a set of cards for each suit, ace to king
        for (int suit = 1; suit <= 4; suit++) {
            for (int value = 1; value <= 13; value++) {
                Card card = new Card(value, suit);
                System.out.println(card);
            }
        }

        // Adds 2 Jokers to the whole deck
        Card joker1 = new Card();
        Card joker2 = new Card();
        System.out.println(joker1);
        System.out.println(joker2);
    }
}