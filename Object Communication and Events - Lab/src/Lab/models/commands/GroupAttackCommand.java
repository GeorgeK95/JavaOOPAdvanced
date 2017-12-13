package Lab.models.commands;

import Lab.contracts.AttackGroup;
import Lab.contracts.Command;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class GroupAttackCommand implements Command {

    private AttackGroup attackGroup;

    public GroupAttackCommand(AttackGroup attacker) {
        this.attackGroup = attacker;
    }

    @Override
    public void execute() {
        this.attackGroup.groupAttack();
    }
}
