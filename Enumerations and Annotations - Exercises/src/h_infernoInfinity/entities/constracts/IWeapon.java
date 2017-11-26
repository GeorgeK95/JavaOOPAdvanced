package h_infernoInfinity.entities.constracts;

import h_infernoInfinity.entities.Gem;
import h_infernoInfinity.entities.Weapon;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IWeapon extends Comparable<Weapon> {
    void add(int index, Gem gem);

    void remove(int index);

    String print();

    String getItemLevelFormattedOutput();

    int compareTo(Weapon o);
}
