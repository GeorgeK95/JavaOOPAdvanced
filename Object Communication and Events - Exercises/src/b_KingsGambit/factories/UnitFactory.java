package b_KingsGambit.factories;

import b_KingsGambit.enums.UnitType;
import b_KingsGambit.models.Footman;
import b_KingsGambit.models.RoyalGuard;
import b_KingsGambit.models.Unit;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class UnitFactory {
    public static Unit create(UnitType type, String unitName) {
        switch (type) {
            case FOOTMAN:
                return new Footman(unitName);
            case GUARD:
                return new RoyalGuard(unitName);
        }
        return null;
    }
}
