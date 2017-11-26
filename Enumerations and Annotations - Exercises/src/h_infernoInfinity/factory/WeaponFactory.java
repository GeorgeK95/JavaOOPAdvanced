package h_infernoInfinity.factory;

import h_infernoInfinity.entities.Weapon;
import h_infernoInfinity.entities.WeaponType;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public final class WeaponFactory {

    public static Weapon createWeapon(String weaponType, String weaponName) {
        return new Weapon(weaponName, WeaponType.valueOf(weaponType));
    }
}
