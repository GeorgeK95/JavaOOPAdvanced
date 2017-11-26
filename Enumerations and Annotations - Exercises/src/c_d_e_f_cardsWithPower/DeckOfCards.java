package c_d_e_f_cardsWithPower;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class DeckOfCards {

    public static void printDeckOfCards() {
        SuitPowers[] suits = SuitPowers.values();
        RankPowers[] ranks = RankPowers.values();

        for (SuitPowers suit : suits) {
            for (RankPowers rank : ranks) {
                System.out.println(String.format("%s of %s", rank, suit));
            }
        }
    }
}
