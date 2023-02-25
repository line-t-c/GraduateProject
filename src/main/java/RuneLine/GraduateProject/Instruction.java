package RuneLine.GraduateProject;

import jakarta.persistence.*;

@Entity
public class Instruction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recipe_steps")
    private String recipeSteps;

    @ManyToOne
    @JoinColumn(name = "recipe_id_fk")
    private Recipe recipe;

    public Instruction() {
    }

    public Instruction(String recipeSteps) {
        this.recipeSteps = recipeSteps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipeSteps() {
        return recipeSteps;
    }

    public void setRecipeSteps(String recipeSteps) {
        this.recipeSteps = recipeSteps;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
