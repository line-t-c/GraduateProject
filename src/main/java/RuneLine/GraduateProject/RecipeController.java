package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepo repository;

    @Autowired
    private RecipeMethods recipeMethods;

//    JPA funktioner, if needed
//    count of Recipe table
//    long count = repository.count();


    @GetMapping("/")
    public String home () {
        return "home";
    }

//        if (!ingredients.isEmpty()) {
//            String[] ingredientList = ingredients.split(" ");
//            searchResult = repository.findByIngredientNames(Arrays.asList(ingredientList), ingredientList.length);
//        }

//    @GetMapping("/search")
//    public String searchRecipesByIngredient(@RequestParam(required=false, defaultValue = " ") String ingredients, Model model) {
//        List<String> ingredientList = Arrays.asList(ingredients.split("\\s*,\\s*"));
//        List<Recipe> searchResult = repository.findByIngredientNames(ingredientList, ingredientList.size());
//        model.addAttribute("searchResult", searchResult);
//        model.addAttribute("ingredientName", ingredients);
//        return "searchResults";
//    }
//    the split("\\s*,\\s*") method call will split the ingredients string using comma as a delimiter
//    and also remove any whitespace characters around each item.

    @GetMapping("/opskrifter")
    public String alleOpskrifter (Model model) {
//        List<Recipe> recipeList = new ArrayList<>();
        Iterable<Recipe> recipeList = repository.findAll();
        model.addAttribute("recipes", recipeList);
        return "recipes";
    }

//  find all recipes
//  Iterable<Recipe> recipes = repository.findAll();

    @GetMapping("/om")
    public String about () {
        return "about";
    }

}
