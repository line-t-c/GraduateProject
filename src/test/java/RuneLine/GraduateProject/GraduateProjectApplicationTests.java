package RuneLine.GraduateProject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GraduateProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	List<Recipe> recipeTest;
	@BeforeEach
	public void before() {
    recipeTest = new ArrayList<>();

//	Set up recipes for testing

	Ingredient ingredient1 = new Ingredient("Carrot", 1, "https://www.valdemarsro.dk/wp-content/2016/10/carbonara_app-1300.jpg");
	Ingredient ingredient2 = new Ingredient("Water", 1, "https://www.valdemarsro.dk/wp-content/2018/01/kyllingesalat.jpg");

	List<Ingredient> ingredientList = new ArrayList<>();
	ingredientList.add(ingredient1);
	ingredientList.add(ingredient2);

	Instruction instruction1 = new Instruction("Peel the carrot");
	Instruction instruction2 = new Instruction("Boil it");
	Instruction instruction3 = new Instruction("Blend it");

	List<Instruction> instructionList = new ArrayList<>();
	instructionList.add(instruction1);
	instructionList.add(instruction2);
	instructionList.add(instruction3);

	Recipe carrotSoup = new Recipe(1, "CarrotSoup", 4, instructionList, ingredientList, "www");
	}

	@Test
	public void testScale (int numPersons) {
		Recipe result = RecipeService.scaleRecipe(recipeTest,5);
		assertEquals( 5, result.getTitle( ) );
	}

//	Så hvis man har gennemført et step, overstreges den. Boolean default false. Boolean if false == true. JS?
	@Test
	public void testNextStep2 (boolean done) {
		Boolean result = RecipeService.isDone(false);
		assertEquals( true, result.booleanValue( ));
	}

}
