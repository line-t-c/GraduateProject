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
//    public List<Recipe> findByIngredient(List<String> ingredientNames) {
//        List<Recipe> recipes = (List<Recipe>) repository.findAll();
//        return recipes.stream()
//                .filter(recipe -> recipe.getIngredients().stream()
//                        .allMatch(ingredient -> ingredientNames.contains(ingredient.getIngredientName())))
//                .collect(Collectors.toList());
//    }

    public List<Recipe> findByIngredients(List<String> ingredientNames) {
        List<Recipe> recipes = (List<Recipe>) repository.findAll();
        return recipes.stream()
                .filter(recipe -> ingredientNames.stream().allMatch(
                        ingredient -> recipe.getIngredients().stream()
                                .anyMatch(recipeIngredient -> recipeIngredient.getIngredientName().equals(ingredient))))
                .collect(Collectors.toList());
    }


//    //  A method to find all recipes that contain a specific ingredient:
//    public List<Recipe> findByIngredient(String ingredientName) {
//        List<Recipe> recipes = (List<Recipe>) repository.findAll();
//        return recipes.stream()
//                .filter(recipe -> recipe.getIngredients().stream()
//                        .anyMatch(ingredient -> ingredient.getIngredientName().equalsIgnoreCase(ingredientName)))
//                .collect(Collectors.toList());
//    }







    public static Recipe scaleRecipe(List<Recipe> recipeTest, int i) {
        return null;
    }

    public static Boolean isDone(boolean isDone) {
        Boolean isStepDone = !isDone;
        return isStepDone;
    }

}
