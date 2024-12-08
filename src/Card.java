public class Card {
    
    // Attributes:
    private int value; // Card value (1-13, 0 for Joker)
    private int suit;  // Card suit (1-4, 0 for Joker)
    private String name; // Printable name for the card

    // Default constructor: (creates a Joker)
    public Card() {
        this.value = 0;
        this.suit = 0;
        this.name = "Joker";
    }

    // Constructor with value and suit parameters:
    public Card(int value, int suit) {
        this.value = (value >= 0 && value <= 13) ? value : 0; // Ensures valid value
        this.suit = (suit >= 0 && suit <= 4) ? suit : 0; // Ensures valid value
        this.name = generateName(this.value, this.suit); // Calls the method that generates the card's name
    }

    // Method to generate a card's name based on value and suit
    private String generateName(int value, int suit) {

        // Checks for Joker
        if (value == 0 || suit == 0) { 
            return "Joker";
        }

        // Key to locate correct value and suit
        String[] values = {"", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"", "Hearts", "Diamonds", "Clubs", "Spades"};

        return values[value] + " of " + suits[suit];
    }

    // Gets Card Value
    public int getValue() {
        return value;
    }

    // Gets Card Suit
    public int getSuit() {
        return suit;
    }

    // Sets Value Attribute
    public void setVal(int value) {
        this.value = (value >= 0 && value <= 13) ? value : this.value; // Ensure valid value
        this.name = generateName(this.value, this.suit); // Update name after changing value
    }

    // Returns Card Name
    @Override
    public String toString() {
        return name;
    }
}