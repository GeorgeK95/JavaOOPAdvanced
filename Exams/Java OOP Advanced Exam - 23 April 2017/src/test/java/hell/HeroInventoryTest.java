package hell;

import hell.entities.miscellaneous.HeroInventory;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class HeroInventoryTest {
    private Inventory inventory;

    private Item mockedItem;
    private Item commonItem1;
    private Item commonItem2;

    private Recipe mockedRecipe;
    private Recipe recipeItem1;
    private Recipe recipeItem2;

    @Before
    public void setUp() throws Exception {
        this.inventory = new HeroInventory();

        this.mockedItem = Mockito.mock(Item.class);
        this.commonItem1 = Mockito.mock(Item.class);
        this.commonItem2 = Mockito.mock(Item.class);

        Mockito.when(this.commonItem1.getStrengthBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem1.getHitPointsBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem1.getDamageBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem1.getAgilityBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem1.getIntelligenceBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem2.getStrengthBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem2.getHitPointsBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem2.getDamageBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem2.getAgilityBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.commonItem2.getIntelligenceBonus()).thenReturn(2_000_000_000);

        Mockito.when(this.commonItem1.getName()).thenReturn("item1");
        Mockito.when(this.commonItem2.getName()).thenReturn("item2");

        this.recipeItem1 = Mockito.mock(Recipe.class);
        this.recipeItem2 = Mockito.mock(Recipe.class);
        this.mockedRecipe = Mockito.mock(Recipe.class);

        Mockito.when(this.recipeItem1.getStrengthBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem1.getHitPointsBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem1.getDamageBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem1.getAgilityBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem1.getIntelligenceBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem2.getStrengthBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem2.getHitPointsBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem2.getDamageBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem2.getAgilityBonus()).thenReturn(2_000_000_000);
        Mockito.when(this.recipeItem2.getIntelligenceBonus()).thenReturn(2_000_000_000);

        Mockito.when(this.recipeItem1.getName()).thenReturn("item3");
        Mockito.when(this.recipeItem2.getName()).thenReturn("item4");

        Mockito.when(this.recipeItem1.getRequiredItems()).thenReturn(Arrays.asList(new String[]{"item1", "item2"}));
    }

    @Test
    public void gettersShouldWorkCorrect() throws Exception {
        this.inventory.addCommonItem(this.commonItem1);
        this.inventory.addCommonItem(this.commonItem2);
        Assert.assertEquals(4_000_000_000L, this.inventory.getTotalAgilityBonus());
        Assert.assertEquals(4_000_000_000L, this.inventory.getTotalIntelligenceBonus());
        Assert.assertEquals(4_000_000_000L, this.inventory.getTotalHitPointsBonus());
        Assert.assertEquals(4_000_000_000L, this.inventory.getTotalDamageBonus());
        Assert.assertEquals(4_000_000_000L, this.inventory.getTotalStrengthBonus());
    }

    @Test
    public void addCommonItemShouldBeCorrect() throws Exception {
        this.inventory.addCommonItem(this.commonItem1);
        this.inventory.addCommonItem(this.commonItem2);
        Assert.assertEquals(2, this.getCommonItemsCollectionSize());
    }

    @Test
    public void addRecipeItemShouldBeCorrect() throws Exception {
        this.inventory.addCommonItem(this.commonItem1);
        this.inventory.addCommonItem(this.commonItem2);
        this.inventory.addRecipeItem(this.recipeItem1);
        Assert.assertEquals(1, this.getCommonItemsCollectionSize());
        Assert.assertEquals(1, this.getRecipeItemsCollectionSize());
    }

    @Test(expected = NullPointerException.class)
    public void addCommonItemsNullValueShouldThrowEx() throws Exception {
        this.inventory.addCommonItem(null);
    }

    @Test(expected = NullPointerException.class)
    public void addRecipeItemsNullValueShouldThrowEx() throws Exception {
        this.inventory.addRecipeItem(null);
    }

    private int getCommonItemsCollectionSize() throws IllegalAccessException {
        Field field = HeroInventory.class.getDeclaredFields()[0];
        field.setAccessible(true);
        return ((Map<String, Item>) field.get(this.inventory)).size();
    }

    private int getRecipeItemsCollectionSize() throws IllegalAccessException {
        Field field = HeroInventory.class.getDeclaredFields()[1];
        field.setAccessible(true);
        return ((Map<String, Item>) field.get(this.inventory)).size();
    }

}
