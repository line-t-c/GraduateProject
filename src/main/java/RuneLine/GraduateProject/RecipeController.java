package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepo repository;

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/")
    public String home () {
        return "home";
    }

    @GetMapping("/search")
    public String searchRecipesByIngredients(@RequestParam String ingredients, Model model) {
        List<String> ingredientList = Arrays.asList(ingredients.split("\\s*,\\s*"));
        List<Recipe> searchResult = recipeService.findByIngredients(ingredientList);
        model.addAttribute("ingredientName", ingredients);
        model.addAttribute("searchResult", searchResult);
        return "searchResults";
    }

//  find all recipes
//  Iterable<Recipe> recipes = repository.findAll();

    @GetMapping("/om")
    public String about () {
        return "about";
    }

}
