import models.Axe;
import models.Dummy;
import org.junit.Assert;
import org.junit.Test;

public class AxeTests {
    @Test
    public void ifWeaponLosesDurabilityAfterEachAttack() {
        Axe axe = new Axe(5, 4);
        axe.attack(new Dummy(10, 10));
        axe.attack(new Dummy(10, 10));
        Assert.assertEquals("Weapon does not lose durability properly.", 2, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void attackingWithBrokenWeapon() {
        Axe axe = new Axe(5, -4);
        axe.attack(new Dummy(10, 10));
        Assert.assertEquals(3, axe.getDurabilityPoints());
    }
}
