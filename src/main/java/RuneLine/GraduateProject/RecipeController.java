package RuneLine.GraduateProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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

//    @GetMapping("/opskrifter/{recipeId}")
//    public String opskrift(@PathVariable Long recipeId, Model model) {
//        Recipe recipe = repository.findById(recipeId).get();
//        model.addAttribute("recipe", recipe);
//        return "recipeDetails";
//    }

    @GetMapping("/opskrifter/{id}")
    public String getRecipe(@PathVariable Long id, Model model) {
        Recipe recipe = repository.findById(id).get();
        model.addAttribute("recipe", recipe);
        return "recipeDetails2";
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


    @GetMapping("/opskrifter/{id}/portions")
    public String updatePortionsForm(@PathVariable Long id, Model model) {
        Recipe recipe = repository.findById(id).get();
        model.addAttribute("recipe", recipe);
        return "recipeDetails2";
    }

//    @PutMapping("/opskrifter/{id}/portions")
//    public String updatePortions(@PathVariable Long id, @RequestParam Boolean addPortion) {
//        Recipe recipe = repository.findById(id).get();
//        recipeService.updatePortions(recipe, addPortion);
//        return "redirect:/opskrifter/{id}";
//    }

    @PutMapping("/opskrifter/{id}/portions")
    public String updatePortions(@PathVariable Long id, @RequestParam Boolean addPortion, HttpServletResponse response) {
        Recipe recipe = repository.findById(id).get();
        recipeService.updatePortions(recipe, addPortion);

        // Set the HTTP response status to 204 No Content to indicate success
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);

        return "redirect:/opskrifter/{id}";
    }

//    @GetMapping("/recipe/{id}/portions")
//    public String updatePortionsForm(@PathVariable Long id, Model model) {
//        Recipe recipe = recipeService.findById(id);
//        model.addAttribute("recipe", recipe);
//        return "updatePortions";
//    }

//    // constructor injection
//
//    @GetMapping("/recipe/{id}/portions")
//    public String updatePortionsForm(@PathVariable Long id, Model model) {
//        Recipe recipe = recipeService.findById(id);
//        model.addAttribute("recipe", recipe);
//        return "updatePortions";
//    }
//
//    @PutMapping("/recipe/{id}/portions")
//    public String updatePortions(@PathVariable Long id, @RequestParam Boolean addPortion) {
//        Recipe recipe = recipeService.findById(id);
//        recipeService.updatePortions(recipe, addPortion);
//        return "redirect:/recipe/{id}";
//    }
//}
//In the above example, updatePortions is a new @PutMapping method that maps to the same URL as the updatePortionsForm method. This method takes the recipe id as a path variable and the addPortion parameter as a request parameter. The method loads the recipe from the database using the `






//    @GetMapping("/opskrifter")
//    public  String index(Model model, @RequestParam(defaultValue = "1") int page){
//        int pageSize = 5;
//        int recipeRepoSize = (int) repository.count();
//        int noOfPages = recipeRepoSize / pageSize;
//        if (recipeRepoSize % pageSize > 0){
//            noOfPages++;
//        }
//        if(page < 1){
//            return "redirect:/opskrifter?page=1";
//        } else if(page > noOfPages){
//            return "redirect:/opskrifter/?page=" + noOfPages;
//        }
//        int startIndex = pageSize*(page-1);
//        int endIndex = startIndex + pageSize;
//        if (endIndex > recipeRepoSize){
//            endIndex = recipeRepoSize;
//        }
//        List<Recipe> recipeList = new ArrayList<>();
//        if(startIndex < endIndex){
//            recipeList = repository.findAll().subList(startIndex, endIndex);
//        }
//        model.addAttribute("recipes", recipeList);
//        model.addAttribute("page", page);
//        model.addAttribute("noOfPages", noOfPages);
//
//        return "recipes";
//    }

//    @GetMapping("/opskrifter")
//    public String index(Model model, @RequestParam(defaultValue = "0") int page) {
//        int pageSize = 5;
//        Pageable pageable = PageRequest.of(page, pageSize);
//        Page<Recipe> recipePage = repository.findAll(pageable);
//        int recipeRepoSize = (int) recipePage.getTotalElements();
//        int noOfPages = recipePage.getTotalPages();
//
//        if (page < 0 || page >= noOfPages) {
//            return "redirect:/opskrifter?page=0";
//        }
//
//        List<Recipe> recipeList = recipePage.getContent();
//
//        model.addAttribute("recipes", recipeList);
//        model.addAttribute("page", page);
//        model.addAttribute("noOfPages", noOfPages);
//
//        return "recipes";
//    }





//    @GetMapping("/opskrifter")
//    public String index(Model model, @RequestParam(defaultValue = "1") int page){
//        int pageSize = 5;
//        PageRequest pageRequest = PageRequest.of(page - 1, pageSize);
//        Page<Recipe> recipePage = repository.findAll(pageRequest);
//        List<Recipe> recipeList = recipePage.getContent();
//        int noOfPages = recipePage.getTotalPages();
//
//        if(page < 1){
//            return "redirect:/opskrifter?page=1";
//        } else if(page > noOfPages){
//            return "redirect:/opskrifter/?page=" + noOfPages;
//        }
//
//        model.addAttribute("recipes", recipeList);
//        model.addAttribute("page", page);
//        model.addAttribute("noOfPages", noOfPages);
//
//        return "recipes";
//    }







//  find all recipes
//  Iterable<Recipe> recipes = repository.findAll();

    @GetMapping("/om")
    public String about () {
        return "about";
    }

    @GetMapping("/testview")
    public String testview () {
        return "testview";
    }
}
