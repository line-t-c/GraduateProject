package RuneLine.GraduateProject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Long> {

//      @Query("SELECT DISTINCT r.title, r.image_url " +
//              "FROM recipe AS r " +
//              "INNER JOIN ingredient AS i " +
//              "ON r.id = i.recipe_id_fk " +
//              "WHERE i.ingredient_name IN (%s) " +
//              "GROUP BY r.id " +
//              "HAVING COUNT(DISTINCT i.ingredient_name) = %d;")
//      List<Recipe> findByIngredientNames(String ingredientName);

//      @Query("SELECT DISTINCT r.title, r.image_url " +
//              "FROM recipe AS r " +
//              "INNER JOIN ingredient AS i " +
//              "ON r.id = i.recipe_id_fk " +
//              "WHERE i.ingredient_name IN :ingredientNames " +
//              "GROUP BY r.id " +
//              "HAVING COUNT(DISTINCT i.ingredient_name) = :ingredientCount")
//      List<Recipe> findByIngredientNames(@Param("ingredientNames") List<String> ingredientNames);

//      @Query("SELECT DISTINCT r.title, r.image_url " +
//              "FROM recipe AS r " +
//              "INNER JOIN ingredient AS i " +
//              "ON r.id = i.recipe_id_fk " +
//              "WHERE i.ingredient_name IN :ingredientNames " +
//              "GROUP BY r.id " +
//              "HAVING COUNT(DISTINCT i.ingredient_name) = :ingredientCount")
//      List<Recipe> findByIngredientNames(@Param("ingredientNames") List<String> ingredientNames,
//                                         @Param("ingredientCount") int ingredientCount);

//      To fix this, you can use the FIND_IN_SET function instead of the IN operator.
//      The FIND_IN_SET function checks if a value is in a comma-separated list of values,
//      which is what we need to search for multiple ingredients.

//      @Query("SELECT DISTINCT r.title, r.image_url " +
//              "FROM recipe AS r " +
//              "INNER JOIN ingredient AS i " +
//              "ON r.id = i.recipe_id_fk " +
//              "WHERE FIND_IN_SET(i.ingredient_name, :ingredientNames) " +
//              "GROUP BY r.id " +
//              "HAVING COUNT(DISTINCT i.ingredient_name) = :ingredientCount")
//      List<Recipe> findByIngredientNames(@Param("ingredientNames") List<String> ingredientNames,
//                                         @Param("ingredientCount") int ingredientCount);


//      FIND_IN_SET(str,strlist) is a MySQL function that searches for the string str
//      within a comma-separated list of strings strlist,
//      and returns the position of str within strlist.

//      SELECT DISTINCT r.title, r.image_url FROM recipe AS r INNER JOIN ingredient AS i ON r.id = i.recipe_id_fk WHERE i.ingredient_name IN ('cherrytomater') GROUP BY r.id HAVING COUNT(DISTINCT i.ingredient_name) = 1;

//      Første string findBy.. til filtere, alle med gulerødder, Gå den igennem, Stream, og filterer dem ud der også har løg, osv.

//      To resultat lister pr ingrediens. Sætte dem sammen. Dubletter, unikke.
//


    //// find one customer by id
//Customer customer = repository.findById(1L).get();
//// save new customer
//repository.save(new Customer("Donald", "Duck"));
//// delete customer
//repository.deleteById(1L);

}
