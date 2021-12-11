package recipe;

import java.util.List;

public class Recipe {
    String name;
    String description;
    String instructions;
    List<Ingredients> ingredients;

    public Recipe(String name, String description, String instructions, List<Ingredients> ingredients) {
        this.name = name;
        this.description = description;
        this.instructions = instructions;
        this.ingredients = ingredients;
    }

    public void addIngredient(String name){
        Ingredients ingredient = new Ingredients(name);
        ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
