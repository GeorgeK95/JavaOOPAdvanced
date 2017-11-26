package h_infernoInfinity.core;

import h_infernoInfinity.entities.Gem;
import h_infernoInfinity.entities.Weapon;
import h_infernoInfinity.enums.CustomAnnotation;
import h_infernoInfinity.factory.WeaponFactory;
import h_infernoInfinity.utilities.Constants;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class GameManager {
    private Map<String, Weapon> weapons;

    public GameManager() {
        this.weapons = new LinkedHashMap<>();
    }

    public void create(String weaponType, String weaponName) {
        this.weapons.put(weaponName, WeaponFactory.createWeapon(weaponType,weaponName));
    }

    public void add(String weaponName, int index, String gemType) {
        this.weapons.get(weaponName).add(index, Gem.valueOf(gemType));
    }

    public void remove(String weaponName, int index) {
        this.weapons.get(weaponName).remove(index);
    }

    public String print(String weaponName) {
        return this.weapons.get(weaponName).print();
    }

    public String compare(String firstWeaponName, String secondWeaponName) {
        int compResult = this.weapons.get(firstWeaponName).compareTo(this.weapons.get(secondWeaponName));
        if (compResult >= 0) {
            return this.weapons.get(firstWeaponName).getItemLevelFormattedOutput();
        }
        return this.weapons.get(secondWeaponName).getItemLevelFormattedOutput();
    }

    public String printAuthor() {
        return Constants.AUTHOR + Weapon.class.getAnnotation(CustomAnnotation.class).author();
    }

    public String printRevision() {
        return Constants.REVISION + Weapon.class.getAnnotation(CustomAnnotation.class).revision();
    }

    public String printDescription() {
        return Constants.DESCRIPTION + Weapon.class.getAnnotation(CustomAnnotation.class).description();
    }

    public String printReviewers() {
        return Constants.REVIEWERS + String.join(", ", Weapon.class.getAnnotation(CustomAnnotation.class).reviewers());
    }
}
