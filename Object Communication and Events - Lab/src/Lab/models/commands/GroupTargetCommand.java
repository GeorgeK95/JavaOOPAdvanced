package Lab.models.commands;

import Lab.contracts.AttackGroup;
import Lab.contracts.Command;
import Lab.contracts.Target;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class GroupTargetCommand implements Command {

    private AttackGroup attackGroup;
    private Target target;

    public GroupTargetCommand(AttackGroup attacker, Target target) {
        this.attackGroup = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        this.attackGroup.groupTarget(this.target);
    }
}
