package contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Target {
    public int getHealth();

    public void takeAttack(int attackPoints);

    public int giveExperience();

    public boolean isDead();

    Weapon getLoot(RandomNumberProvider randomNumberProvider);
}
