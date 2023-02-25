package RuneLine.GraduateProject;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//  Tag for Veganer/Vegetar/uden svinekød/pescetar?

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private int portions;

//    Skal de hedde det samme? "recipe". Automatic joins also gets the related Entity
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Instruction> instruction = new ArrayList<>();

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Ingredient> ingredients = new ArrayList<>();

    @Column(name = "image_url")
    private String imageUrl;

    public Recipe() {
    }

    public Recipe(String title, int portions, List<Instruction> instruction, List<Ingredient> ingredients, String imageUrl) {
        this.title = title;
        this.portions = portions;
        this.instruction = instruction;
        this.ingredients = ingredients;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Instruction> getInstruction() {
        return instruction;
    }

    public void setInstruction(List<Instruction> instruction) {
        this.instruction = instruction;
    }

    public List<Ingredient> getIngredient() {
        return ingredients;
    }

    public void setIngredient(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
