package Lab.models;

import Lab.contracts.AttackGroup;
import Lab.contracts.Attacker;
import Lab.contracts.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Group implements AttackGroup {
    private List<Attacker> attackerList;

    public Group() {
        this.attackerList = new ArrayList<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        this.attackerList.add(attacker);
    }

    @Override
    public void groupTarget(Target target) {
        this.attackerList.forEach(a -> a.setTarget(target));
    }

    @Override
    public void groupAttack() {
        this.attackerList.forEach(Attacker::attack);
    }
}
