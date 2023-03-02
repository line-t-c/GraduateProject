package RuneLine.GraduateProject;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional

class GraduateProjectApplicationTests {

	@Autowired
	private RecipeService recipeService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testFindByIngredient() {
		List<String> ingredients1 = Arrays.asList("gulerødder", "kartofler");
		List<String> ingredients2 = Arrays.asList("smør", "æg");
		String diets1 = "glutenfri";
		String diets2 = "vegetar";
		List<Recipe> recipes1 = recipeService.findByIngredientsAndDiet(ingredients1, diets1);
		List<Recipe> recipes2 = recipeService.findByIngredientsAndDiet(ingredients2, diets2);
		assertEquals(1, recipes1.size());
		assertEquals(3, recipes2.size());
		Recipe recipe1 = recipes1.get(0);
		Recipe recipe2 = recipes2.get(0);
		assertEquals("Lørdagskylling med gulerødder", recipe1.getTitle());
		assertEquals("Majspandekager", recipe2.getTitle());
	}
}