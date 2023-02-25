package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

//Evt en serviceklasse til metoderne. Kan være statisk.
//	JPA - der er ingen beregninger at teste på

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo repository;

//    search for recipes that contain all of the given ingredients with allMatch method
    public List<Recipe> findByIngredients(List<String> ingredientNames) {
        List<Recipe> recipes = (List<Recipe>) repository.findAll();
        return recipes.stream()
                .filter(recipe -> ingredientNames.stream().allMatch(
                        ingredient -> recipe.getIngredients().stream()
                                .anyMatch(recipeIngredient -> recipeIngredient.getIngredientName().equals(ingredient))))
                .collect(Collectors.toList());
    }


    // Increase portion size and update ingredient amounts
    public void addPortion(Recipe recipe) {
        int newPortions = recipe.getPortions() + 1;
        recipe.setPortions(newPortions);
        for (Ingredient ingredient : recipe.getIngredients()) {
            double newAmount = ingredient.getAmount() * newPortions / recipe.getPortions();
            ingredient.setAmount(newAmount);
        }
    }

    // Decrease portion size and update ingredient amounts
    public void removePortion(Recipe recipe) {
        int newPortions = recipe.getPortions() - 1;
        if (newPortions >= 1) {
            recipe.setPortions(newPortions);
            for (Ingredient ingredient : recipe.getIngredients()) {
                double newAmount = ingredient.getAmount() * newPortions / recipe.getPortions();
                ingredient.setAmount(newAmount);
            }
        }
    }

    // other methods in your RecipeService class

    public void updatePortions(Recipe recipe, boolean addPortion) {
        int currentPortions = recipe.getPortions();
        int newPortions = addPortion ? currentPortions + 1 : currentPortions - 1;

        // calculate the scaling factor for the ingredients
        double scalingFactor = (double) newPortions / currentPortions;

        // update the ingredient quantities
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient ingredient : ingredients) {
            double oldAmount = ingredient.getAmount();
            double newAmount = oldAmount * scalingFactor;
            ingredient.setAmount(newAmount);
        }

        recipe.setPortions(newPortions);
    }











    public static Recipe scaleRecipe(List<Recipe> recipeTest, int i) {
        return null;
    }

    public static Boolean isDone(boolean isDone) {
        Boolean isStepDone = !isDone;
        return isStepDone;
    }

}
