package RuneLine.GraduateProject;

import org.springframework.stereotype.Service;

import java.util.List;

//Evt en serviceklasse til metoderne. Kan være statisk.
//	JPA - der er ingen beregninger at teste på

@Service
public class RecipeMethods {


    public static Recipe scaleRecipe(List<Recipe> recipeTest, int i) {
        return null;
    }

    public static Boolean isDone(boolean isDone) {
        Boolean isStepDone = !isDone;
        return isStepDone;
    }

}
