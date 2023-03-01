package RuneLine.GraduateProject;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ingredient_name")
    private String ingredientName;

    private int amount;

    private String measurement;

    @ManyToOne
    @JoinColumn(name = "recipe_id_fk")
    private Recipe recipe;

    @OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL)
    private List<Tips> tips;

    public Ingredient() {
    }

    public Ingredient(String ingredientName, int amount, String measurement, List<Tips> tips) {
        this.ingredientName = ingredientName;
        this.amount = amount;
        this.measurement = measurement;
        this.tips = tips;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public List<Tips> getTips() {
        return tips;
    }

    public void setTips(List<Tips> tips) {
        this.tips = tips;
    }
}
