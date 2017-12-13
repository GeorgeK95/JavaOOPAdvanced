package Lab;

import Lab.contracts.AttackGroup;
import Lab.contracts.Command;
import Lab.contracts.Executor;
import Lab.contracts.Target;
import Lab.enums.LogType;
import Lab.models.Dragon;
import Lab.models.Group;
import Lab.models.Warrior;
import Lab.models.commands.CommandExecutor;
import Lab.models.commands.GroupAttackCommand;
import Lab.models.commands.GroupTargetCommand;
import Lab.models.loggers.CombatLogger;
import Lab.models.loggers.EventLogger;
import Lab.models.loggers.Logger;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Logger combat = new CombatLogger();
        Logger event = new EventLogger();

        combat.setSuccessor(event);

        AttackGroup group = new Group();
        group.addMember(new Warrior("pesho", 10, combat));
        group.addMember(new Warrior("Vazilin", 13, combat));

        Target dragon = new Dragon("ivanch0", 100, 25, combat);

        Executor executor = new CommandExecutor();

        Command targetCommand = new GroupTargetCommand(group, dragon);
        Command attackCommand = new GroupAttackCommand(group);

        combat.handle(LogType.ATTACK, "attack");
        combat.handle(LogType.ERROR, "error");
        combat.handle(LogType.EVENT, "event");
    }
}
