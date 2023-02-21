package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
    @GetMapping("/about")
    public String about () {
        return "about";
    }
}
