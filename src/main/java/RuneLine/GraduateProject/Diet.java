package RuneLine.GraduateProject;

import jakarta.persistence.*;

@Entity
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_vegetarian")
    private boolean isVegetarian;

    @Column(name = "is_vegan")
    private boolean isVegan;

    @Column(name = "is_lactose_free")
    private boolean isLactoseFree;
    @Column(name = "is_gluten_free")
    private boolean isGlutenFree;

    @ManyToOne
    @JoinColumn(name = "recipe_id_fk")
    private Recipe recipe;

    public Diet() {
    }

    public Diet(boolean isVegetarian, boolean isVegan, boolean isLactoseFree, boolean isGlutenFree) {
        this.isVegetarian = isVegetarian;
        this.isVegan = isVegan;
        this.isLactoseFree = isLactoseFree;
        this.isGlutenFree = isGlutenFree;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isLactoseFree() {
        return isLactoseFree;
    }

    public void setLactoseFree(boolean lactoseFree) {
        isLactoseFree = lactoseFree;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
