package RuneLine.GraduateProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GraduateProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	Recipe sut;
	@BeforeEach
	public void before() {
    sut = new Recipe();
	}

	@Test
	public void test1() {
	String message = sut.getMessage("Academy");
	Assertions.assertEquals("Hello Academy", message);
	}

	Ingredient cal;

	@BeforeEach
	public void beforeAgain(){
		cal = new Ingredient();
	}

	@Test
	public void testCalculator() {
		int result = cal.getValue("0");
		int result2 = cal.getValue("1");

		Assertions.assertEquals(0, result);
		Assertions.assertEquals(1, result2);
	}

}
