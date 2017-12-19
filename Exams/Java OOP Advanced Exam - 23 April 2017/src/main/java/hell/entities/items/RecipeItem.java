package hell.entities.items;

import hell.interfaces.Recipe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class RecipeItem extends BaseItem implements Recipe {
    private List<String> requiredItems;

    public RecipeItem(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus, String... requiredItems) {
        super(name, strengthBonus, agilityBonus, intelligenceBonus, hitPointsBonus, damageBonus);
        this.requiredItems = Arrays.asList(requiredItems);
    }

    public List<String> getRequiredItems() {
        return requiredItems;
    }
}
