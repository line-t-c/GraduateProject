package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

//    @PostMapping("/result")
//    public String searchResul () {
//        return "result";
//    }

}
