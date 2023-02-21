package RuneLine.GraduateProject;

import jakarta.persistence.*;

import java.util.List;

//  Tag for Veganer/Vegetar/uden svinekød/pescetar???

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Instruction> instruction;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;

    public Recipe() {
    }

    public Recipe(int id, String title, List<Instruction> instruction, List<Ingredient> ingredients) {
        this.id = id;
        this.title = title;
        this.instruction = instruction;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
