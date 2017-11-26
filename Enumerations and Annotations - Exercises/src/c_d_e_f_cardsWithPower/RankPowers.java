package c_d_e_f_cardsWithPower;

/**
 * Created by George(Lenovo on 6/29/2017.
 */
@CustomEnumAnnotation(category = "Rank", description = "Provides rank constants for a Card class.")
public enum RankPowers {
    ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private int power;

    RankPowers(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
