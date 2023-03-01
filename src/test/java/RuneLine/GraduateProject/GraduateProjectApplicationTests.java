package RuneLine.GraduateProject;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
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
		List<String> ingredients1 = Arrays.asList("bacon", "parmesan");
		List<String> ingredients2 = Arrays.asList("kartofler", "syltede rødbeder");
		List<Recipe> recipes1 = recipeService.findByIngredients(ingredients1);
		List<Recipe> recipes2 = recipeService.findByIngredients(ingredients2);
		assertEquals(1, recipes1.size());
		assertEquals(4, recipes2.size());
		Recipe recipe1 = recipes1.get(0);
		Recipe recipe2 = recipes2.get(0);
		assertEquals("Pasta Carbonara", recipe1.getTitle());
		assertEquals("Vegetarisk Brændende Kæerlighed", recipe2.getTitle());
	}
}
