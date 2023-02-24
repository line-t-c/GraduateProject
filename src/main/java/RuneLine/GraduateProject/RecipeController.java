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

//    @GetMapping("/opskrifter")
//    public String alleOpskrifter (Model model) {
////        List<Recipe> recipeList = new ArrayList<>();
//        Iterable<Recipe> recipeList = repository.findAll();
//        model.addAttribute("recipes", recipeList);
//        return "recipes";
//    }

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

}
