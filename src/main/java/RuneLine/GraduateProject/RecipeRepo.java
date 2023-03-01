package RuneLine.GraduateProject;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Long> {

    @Query("SELECT r FROM Recipe r WHERE r.id IN :id")
    List<Recipe> findRecipesById(@Param("id") List<Long> id);


}
