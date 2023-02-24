package RuneLine.GraduateProject;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Long> {
    Iterable <Recipe> findByTitle (String title);


//      SELECT DISTINCT r.title, r.image_url FROM recipe AS r INNER JOIN ingredient AS i
//      ON r.id = i.recipe_id_fk WHERE i.ingredient_name IN ('cherrytomater')
//      GROUP BY r.id HAVING COUNT(DISTINCT i.ingredient_name) = 1;





    //// find one customer by id
//Customer customer = repository.findById(1L).get();
//// save new customer
//repository.save(new Customer("Donald", "Duck"));
//// delete customer
//repository.deleteById(1L);

}
