package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepo repository;

    @Autowired
    private RecipeMethods recipeMethods;

//    JPA funktioner, if needed
    // count of Recipe table
//    long count = repository.count();
    // find all recipes
//    Iterable<Recipe> recipes = repository.findAll();

    @GetMapping("/")
    public String home () {
        return "home";
    }
    @GetMapping("/about")
    public String about () {
        return "about";
    }

//    Til mapping, tilføje søgeresultat
//    @GetMapping("/result/{searchResult}")
//    public String searchResult (@PathVariable String searchResult) {
////        Recipe recipe = repository.findByIngredient(searchResult).get();
//        return "result";
//    }

    @GetMapping ("/result")
    public String searchResult () {
        return "result";
    }

//    @GetMapping("/search")
//    public String searchRecipesByIngredient(@RequestParam String ingredients, Model model) {
//        List<Recipe> recipes = repository.findByIngredientName(ingredients);
//        model.addAttribute("recipes", recipes);
//        return "searchResults" + ingredients;
//    }

    @GetMapping("/search")
    public String searchRecipesByIngredient(@RequestParam(name = "ingredient_name", required = false) String ingredientName, Model model) {
        if (ingredientName == null || ingredientName.isEmpty()) {
            // handle the case where no ingredient name is provided
        } else {
            List<Recipe> recipes = repository.findByIngredientName(ingredientName);
            model.addAttribute("recipes", recipes);
            model.addAttribute("ingredientName", ingredientName);
            return "searchResults";
        }
        return "searchResults";
    }




//    @GetMapping("/search")
//    public String searchRecipesByIngredient(@RequestParam(name = "ingredient_name") String ingredientName, Model model) {
//        List<Recipe> recipes = repository.findByIngredientName(ingredientName);
//        model.addAttribute("recipes", recipes);
//        return "searchResults" + ingredientName;
//    }


//    @GetMapping("/search/{ingredient_name}")
//    public String searchRecipesByIngredient(@PathVariable String ingredient_name, Model model) {
//        List<Recipe> recipes = repository.findByIngredientName(ingredient_name);
//        model.addAttribute("recipes", recipes);
//        return "searchResults" + ingredient_name;
//    }

//    http://localhost:8080/search?ingredients=bacon

//                for (Recipe recipe : recipes) {
//            String imageUrl = recipe.getImageUrl();
//            model.addAttribute("imageUrl", imageUrl);
//            }



//    @GetMapping("/search")
//    public String searchRecipesByIngredients(@RequestParam("ingredients") String ingredients, Model model) {
//        List<Recipe> recipes = repository.findRecipesByIngredients(ingredients.split(","));
//        model.addAttribute("recipes", recipes);
//        return "searchResults";
//    }

//    @PostMapping("/result")
//    public String searchResul () {
//        return "result";
//    }

}
