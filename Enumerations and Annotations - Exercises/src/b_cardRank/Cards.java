package b_cardRank;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public enum Cards {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    public static void printIteratedEnumConstants() {
        System.out.println("Card Ranks:");
        for (Cards card : Cards.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", card.ordinal(), card.name()));
        }
    }
}
