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

    @GetMapping("/opskrifter")
    public String alleOpskrifter (Model model) {
        List<Recipe> recipes = (List<Recipe>) repository.findAll();
        model.addAttribute("recipes", recipes);
        return "allRecipes";
    }

    @GetMapping("/opskrifter/{id}")
    public String getRecipe(@PathVariable Long id, Model model) {
        Recipe recipe = repository.findById(id).get();
        model.addAttribute("recipe", recipe);
        return "recipeDetails";
    }

    @PostMapping("/recipe/{id}")
    public String updateRecipe(@PathVariable long id, @RequestParam boolean isPortionAdded) {
        // fetch the recipe from the database based on its ID
        Recipe recipe = repository.findById(id).get();
        // update the portions and ingredient amounts
        recipeService.updatePortions(recipe, isPortionAdded);
        // save the updated recipe back to the database
        repository.save(recipe);
        // redirect the user back to the recipe page
        return "redirect:/recipe/{id}";
    }



    @GetMapping("/om")
    public String about () {
        return "about";
    }

    @GetMapping("/testview")
    public String testview () {
        return "testview";
    }
}
