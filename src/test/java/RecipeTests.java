import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import recipe.Ingredients;
import recipe.Recipe;
import java.util.ArrayList;
import java.util.List;

public class RecipeTests {
    @Test
    public void CreateRecipe(){
        Ingredients spaghetti = new Ingredients("spaghetti");
        Ingredients tomatosauce = new Ingredients("tomatosauce");

        List<Ingredients> ingredientsList = new ArrayList<>();

        ingredientsList.add(spaghetti);
        ingredientsList.add(tomatosauce);

        Recipe recipe = new Recipe("spaghetti", "a plate of spaghetti", "cook spaghetti and put on plate", ingredientsList);

        Assertions.assertEquals("spaghetti", recipe.getName());
        Assertions.assertEquals(ingredientsList, recipe.getIngredients());
    }

    @Test
    public void addIngredientToRecipe(){
        List<Ingredients> ingredientsList = new ArrayList<>();

        Recipe recipe = new Recipe("spaghetti", "a plate of spaghetti", "cook spaghetti and put on plate", ingredientsList);

        recipe.addIngredient("meat");

        Assertions.assertEquals(ingredientsList, recipe.getIngredients());
    }

}
