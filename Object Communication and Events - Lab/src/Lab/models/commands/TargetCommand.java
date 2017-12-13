package Lab.models.commands;

import Lab.contracts.Attacker;
import Lab.contracts.Command;
import Lab.contracts.Target;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class TargetCommand implements Command {
    private Attacker attacker;
    private Target target;

    public TargetCommand(Attacker attacker, Target target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        this.attacker.setTarget(this.target);
    }
}
