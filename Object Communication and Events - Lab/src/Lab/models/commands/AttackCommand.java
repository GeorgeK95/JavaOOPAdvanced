package Lab.models.commands;

import Lab.contracts.Attacker;
import Lab.contracts.Command;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class AttackCommand implements Command {
    private Attacker attacker;

    public AttackCommand(Attacker attacker) {
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        this.attacker.attack();
    }
}
