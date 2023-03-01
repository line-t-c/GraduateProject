package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo repository;

//    Search for recipes that contain all of the given ingredients with allMatch method
    public List<Recipe> findByIngredients(List<String> ingredientNames) {
        List<Recipe> recipes = (List<Recipe>) repository.findAll();
        return recipes.stream()
                .filter(recipe -> ingredientNames.stream().allMatch(
                        ingredient -> recipe.getIngredients().stream()
                                .anyMatch(recipeIngredient -> recipeIngredient.getIngredientName().equals(ingredient))))
                .collect(Collectors.toList());
    }
//
//    public List<Recipe> findByIngredientsAndDiet(List<String> ingredientNames, String diet) {
//        List<Recipe> recipes = (List<Recipe>) repository.findAll();
//        return recipes.stream()
//                .filter(recipe -> ingredientNames.stream().allMatch(
//                        ingredient -> recipe.getIngredients().stream()
//                                .anyMatch(recipeIngredient -> recipeIngredient.getIngredientName().equals(ingredient))))
//                .collect(Collectors.toList());
//    }

//    public List<Recipe> findByIngredientsAndDiet(List<String> ingredients, String diet) {
//        List<Recipe> recipes = findByIngredients(ingredients);
//        if (diet != null) {
//            if (diet.equalsIgnoreCase("vegetar")) {
//
//            } else (diet.equalsIgnoreCase("vegansk")) {
//
//            }
//        }
//        return recipes;
//    }

//    public List<Recipe> findByIngredientsAndDiet(List<String> ingredients, String diet) {
//        List<Recipe> recipes = findByIngredients(ingredients);
//        if (diet != null) {
//            boolean isVegetarian = diet.equalsIgnoreCase("vegetar");
//            boolean isVegan = diet.equalsIgnoreCase("vegansk");
//            recipes = recipes.stream()
//                    .filter(recipe -> {
//                        if (isVegetarian && !recipe.getDiets().stream()
//                                .anyMatch(recipeDiet -> recipeDiet.isVegetarian().equals(ingredient)))) {
//                            return false;
//                        }
//                        if (isVegan && !recipe.getDiets().isVegan()) {
//                            return false;
//                        }
//                        return true;
//                    })
//                    .collect(Collectors.toList());
//        }
//        return recipes;
//    }


}
