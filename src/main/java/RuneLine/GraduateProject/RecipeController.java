package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    @GetMapping("/")
    public String home () {
        return "home";
    }

//    @GetMapping("/search")
//    public String searchRecipesByIngredient(@RequestParam(required=false, defaultValue = " ") String ingredients, Model model) {
//        List<String> ingredientList = Arrays.asList(ingredients.split("\\s*,\\s*"));
////        String ingredientListAsString = "";
////        for (int i = 0; i<ingredientList.size(); i++){
////            if (i == 0) {
////                ingredientListAsString += "'" + ingredientList.get(i) + "'";
////            } else {
////                ingredientListAsString += ", '" + ingredientList.get(i) + "'";
////            }
////        }
//        List<Ingredient> searchResult = repository.findByIngredientName(ingredientList.get(0));
//        model.addAttribute("searchResult", searchResult);
//        model.addAttribute("ingredientName", ingredients);
//        return "searchResults";
//    }
//    the split("\\s*,\\s*") method call will split the ingredients string using comma as a delimiter
//    and also remove any whitespace characters around each item.







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


    @GetMapping("/om")
    public String about () {
        return "about";
    }

}
