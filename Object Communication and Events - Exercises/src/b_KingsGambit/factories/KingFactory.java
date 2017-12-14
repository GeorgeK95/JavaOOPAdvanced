package b_KingsGambit.factories;

import b_KingsGambit.models.King;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class KingFactory {
    public static King create(String unitName) {
        return new King(unitName);
    }
}
