package RuneLine.GraduateProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepo extends CrudRepository<Recipe, Long> {

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
