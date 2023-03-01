package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo repository;

    public List<Recipe> findByIngredientsAndDiet(List<String> ingredientNames, String diet) {
        List<Recipe> recipes = (List<Recipe>) repository.findAll();
        return recipes.stream()
                .filter(recipe -> ingredientNames.stream().allMatch(
                        ingredient -> recipe.getIngredients().stream()
                                .anyMatch(recipeIngredient -> recipeIngredient.getIngredientName().equals(ingredient))))
                .filter(recipe -> diet == null || recipe.getDiets().stream().anyMatch(d ->
                        (diet.equals("vegetar") && d.isVegetarian()) ||
                                (diet.equals("vegansk") && d.isVegan()) ||
                                (diet.equals("laktosefri") && d.isLactoseFree()) ||
                                (diet.equals("glutenfri") && d.isGlutenFree())))
                .collect(Collectors.toList());
    }

    public List<Recipe> findByDiet(String diet) {
        List<Recipe> recipes = (List<Recipe>) repository.findAll();
        return recipes.stream()
                .filter(recipe -> diet == null || recipe.getDiets().stream().anyMatch(d ->
                        (diet.equals("vegetar") && d.isVegetarian()) ||
                                (diet.equals("vegansk") && d.isVegan()) ||
                                (diet.equals("laktosefri") && d.isLactoseFree()) ||
                                (diet.equals("glutenfri") && d.isGlutenFree())))
                .collect(Collectors.toList());
    }

}
