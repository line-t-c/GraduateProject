package RuneLine.GraduateProject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Long> {
    Iterable <Recipe> findByTitle (String title);

//    @Query("SELECT DISTINCT r.title, r.image_url " +
//            "FROM recipe AS r " +
//            "INNER JOIN ingredient AS i " +
//            "ON r.id = i.recipe_id_fk " +
//            "WHERE i.ingredient_name = ?1")
//          List<Recipe> findByIngredientName(String ingredientName);


//      SELECT DISTINCT r.title, r.image_url FROM recipe AS r INNER JOIN ingredient AS i
//      ON r.id = i.recipe_id_fk WHERE i.ingredient_name IN ('cherrytomater')
//      GROUP BY r.id HAVING COUNT(DISTINCT i.ingredient_name) = 1;

//      Første string findBy.. til filtere, alle med gulerødder, Gå den igennem, Stream, og filterer dem ud der også har løg, osv.

//      To resultat lister pr ingrediens. Sætte dem sammen. Dubletter, unikke.
//



}
