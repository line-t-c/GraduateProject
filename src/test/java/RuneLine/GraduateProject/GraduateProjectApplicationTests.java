package RuneLine.GraduateProject;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class GraduateProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	Recipe sut;
	@BeforeEach
	public void before() {
    sut = new Recipe();

//	Set up recipes for testing

	Ingredient ingredient1 = new Ingredient("Carrot", 1, "pc");
	Ingredient ingredient2 = new Ingredient("Water", 1, "L");

	List<Ingredient> ingredientList = new ArrayList<>();
	ingredientList.add(ingredient1);
	ingredientList.add(ingredient2);

	Instruction instruction1 = new Instruction("Peel the carrot");
	Instruction instruction2 = new Instruction("Boil it");
	Instruction instruction3 = new Instruction("Blend it");

	List<Instruction> instructionList = new ArrayList<>();
	instructionList.add(instruction1);
	instructionList.add(instruction2);

	Recipe carrot = new Recipe(1, "CarrotSoup",instructionList, ingredientList);
	}



//	@Test
//	public void test1() {
//	String message = sut.getMessage("Academy");
//	Assertions.assertEquals("Hello Academy", message);
//	}

//	Oprette en test, når man søger noget der ikke er i databasen, sende en meddelelse

//	test for når man søger på en ingrediens, får man alle resultater med denne

	Ingredient cal;

//	@BeforeEach
//	public void beforeAgain(){
//		cal = new Ingredient();
//	}

//	@Test
//	public void testCalculator() {
//		int result = cal.getValue("0");
//		int result2 = cal.getValue("1");
//
//		Assertions.assertEquals(0, result);
//		Assertions.assertEquals(1, result2);
//	}


//	LibraryTest.java
//	public void setUp( ) {
//		book3 = new Book( "Cosmos", "Carl Sagan" );
//		book4 = new Book( "Contact", "Carl Sagan" );
//		library.addBook( book3 );
//		library.addBook( book4 );
//	}
//
//	public void testGetBookByTitleAndAuthor( ) {
//		Book book = library.getBook( "Cosmos", "Carl Sagan" );
//		BookTest.assertEquals( book3, book );
//	}
//
//	public void testGetBooksByAuthor( ) {
//		Vector books = library.getBooks( "Carl Sagan" );
//		assertEquals( "two books not found", 2, books.size( ) );
//		Book book = (Book)books.elementAt(0);
//		BookTest.assertEquals( book3, book );
//		book = (Book)books.elementAt(1);
//		BookTest.assertEquals( book4, book );
//	}



//	BookTest.java
//   public void testGetTitle( ) {
//      Book book = new Book( "Solaris", "Stanislaw Lem" );
//      assertEquals( "Solaris", book.getTitle( ) );
//   }

}
