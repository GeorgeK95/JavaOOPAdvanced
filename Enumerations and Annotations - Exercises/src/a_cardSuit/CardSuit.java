package a_cardSuit;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public enum CardSuit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    public static void printIteratedEnumConstants() {
        System.out.println("Card Suits:");
        for (CardSuit enumConstant : CardSuit.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", enumConstant.ordinal(), enumConstant.name()));
        }
    }
}
