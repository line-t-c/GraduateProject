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

//	@Test
//	public void test1() {
//	String message = sut.getMessage("Academy");
//	Assertions.assertEquals("Hello Academy", message);
//	}

//	Metoder:
//	- Search Ingredients
//	- Filter recipes (fx Allergener / diet)
//	- Choose recipe
//	- Change potion size --> alter ingredient amount
//	- Current step --> Next step (instructions)
//	- Sæson, vise grøntsager i en sæson (tags)




}
