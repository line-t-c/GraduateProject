package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Long> {

//    @Query("SELECT r FROM Recipe r JOIN r.ingredients i WHERE i.ingredientName IN :ingredients")
//    List<Recipe> findRecipesByIngredients(@Param("ingredients") String[] ingredients);
//
//    @Query("SELECT r FROM Recipe r JOIN r.ingredients i WHERE i.ingredient_name = ?1")
//    List<Recipe> findByIngredient(String ingredientName);

//    Error interpreting query [SELECT DISTINCT r FROM Recipe r JOIN r.ingredients i WHERE i.ingredientname = ?1];
//    this may indicate a semantic (user query) problem or a bug in the parser
//    [SELECT DISTINCT r FROM Recipe r JOIN r.ingredients i WHERE i.ingredientname = ?1]

//    Error interpreting query
//    [SELECT DISTINCT r FROM Recipe r JOIN r.ingredients i WHERE i.ingredientname = ?1];
//    this may indicate a semantic (user query) problem or a bug in the parser
//    [SELECT DISTINCT r FROM Recipe r JOIN r.ingredients i WHERE i.ingredientname = ?1]

//    Could not resolve attribute 'ingredientname' of 'RuneLine.GraduateProject.Ingredient'
        @Query("SELECT DISTINCT r FROM Recipe r JOIN r.ingredients i WHERE i.ingredient_name = ?1")
        List<Recipe> findByIngredientName(String ingredientName);





//    A class that implements this interface and it’s methods (inherited from CrudRepository) will be created
//automaticallyl
//    Repo, kun forbundet med Recipe

//    Examples of using the methods in the repository


//    Ingredient ingredient = repository.findById(1L).get();
//    Recipe recipeByIngredients = ingredient.getIngredient_name();

//    Kopieret fra anden opgave
//    Optional<Recipe> findByIngredient(
//            Ingredient ingredient);

    //// find one customer by id
//Customer customer = repository.findById(1L).get();
//// save new customer
//repository.save(new Customer("Donald", "Duck"));
//// delete customer
//repository.deleteById(1L);

}
