package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

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

}
