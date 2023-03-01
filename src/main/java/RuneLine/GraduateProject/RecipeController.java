package RuneLine.GraduateProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/*hej*/
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
    public String searchRecipesByIngredients(@RequestParam String ingredients, @RequestParam(required = false) String diet, Model model) {
        List<String> ingredientList = Arrays.asList(ingredients.split("\s*,\s*"));
        List<Recipe> searchResult = recipeService.findByIngredientsAndDiet(ingredientList,diet);
        model.addAttribute("ingredientName", ingredients);
        model.addAttribute("searchResult", searchResult);
        return "searchResults";
    }

    @GetMapping("/opskrifter")
    public String allRecipes (@RequestParam(required = false) String diet, Model model) {
        List<Recipe> recipes = recipeService.findByDiet(diet);
        model.addAttribute("recipes", recipes);
        return "allRecipes";
    }

    @GetMapping("/opskrifter/{id}")
    public String getRecipe(@PathVariable Long id, Model model) {
        Recipe recipe = repository.findById(id).get();
        model.addAttribute("recipe", recipe);
        return "recipeDetails";
    }

    @GetMapping("/saeson")
    public String season () {
        return "season";
    }

    @GetMapping("/om")
    public String about () {
        return "about";
    }

    @GetMapping("/fejl")
    public String fejl () {
        return "error";
    }
}
