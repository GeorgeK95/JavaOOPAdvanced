package hell.repository;

import hell.entities.items.CommonItem;
import hell.interfaces.Hero;
import hell.interfaces.Recipe;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Repository {
    String heroCommand(Hero hero);

    String itemCommand(CommonItem item, String heroName);

    String recipeCommand(Recipe recipe, String heroName);

    String inspectCommand(String heroName) throws IllegalAccessException;

    String quitCommand() throws IllegalAccessException;
}
