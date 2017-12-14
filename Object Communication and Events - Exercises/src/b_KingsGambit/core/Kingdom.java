package b_KingsGambit.core;

import b_KingsGambit.enums.UnitType;
import b_KingsGambit.factories.KingFactory;
import b_KingsGambit.factories.UnitFactory;
import b_KingsGambit.models.King;

import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Kingdom {
    private King king;

    public Kingdom(String kingName, List<String> guardNames, List<String> footmanNames) {
        this.initializeData(kingName, guardNames, footmanNames);
    }

    private void initializeData(String kingName, List<String> guardNames, List<String> footmanNames) {
        this.king = KingFactory.create(kingName);
        guardNames.forEach(g -> king.addLiege(g, UnitFactory.create(UnitType.GUARD, g)));
        footmanNames.forEach(g -> king.addLiege(g, UnitFactory.create(UnitType.FOOTMAN, g)));
    }

    public void respondToAttack() {
        this.king.respond();
    }

    public void killUnit(String name) {
        this.king.getLieges().get(name).kill();
    }
}
