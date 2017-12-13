package Lab.contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface AttackGroup {
    void addMember(Attacker attacker);

    void groupTarget(Target target);

    void groupAttack();

}
