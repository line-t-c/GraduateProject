package RuneLine.GraduateProject;

// Season tag - skal den som en variable eller et ENUM eller hvordan?
// Allergier.

import jakarta.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ingredient_name")
    private String ingredientName;

    private double amount;

    private String measurement;

    @ManyToOne
    @JoinColumn(name = "recipe_id_fk")
    private Recipe recipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ingredient() {
    }

    public Ingredient(String ingredientName, double amount, String measurement) {
        this.ingredientName = ingredientName;
        this.amount = amount;
        this.measurement = measurement;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

}
