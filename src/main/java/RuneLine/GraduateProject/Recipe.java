package RuneLine.GraduateProject;

import jakarta.persistence.*;

import java.util.List;

//  Tag for Veganer/Vegetar/uden svinekød/pescetar??

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="TITLE")
    private String title;

    @Column(name="INSTRUCTION")
    private List<Instruction> instruction;

    @Column(name="INGREDIENT")
    private List<Ingredient> ingredient;


    public Recipe() {
    }

    public Recipe(int id, String title, List<Instruction> instruction, List<Ingredient> ingredient) {
        this.id = id;
        this.title = title;
        this.instruction = instruction;
        this.ingredient = ingredient;
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
        return ingredient;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }
}
