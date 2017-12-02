package factory;

import contracts.RandomNumberProvider;
import contracts.Weapon;
import models.Axe;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
final class AxeFactory {
    private static int MAX_ATTACK = 100;
    private static int MAX_DURABILITY = 100;

    static Weapon generateRandomWeapon(RandomNumberProvider randomNumberProvider) {
        int attack = randomNumberProvider.nextInt(MAX_ATTACK);
        int durability = randomNumberProvider.nextInt(MAX_DURABILITY);
        return new Axe(attack, durability);
    }
}
