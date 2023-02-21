package RuneLine.GraduateProject;

// Season tag - skal den som en variable eller et ENUM eller hvordan?
// Allergier

import jakarta.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ingredient;

    private double amount;

    private String measurement;

    private Double portions;

    @ManyToOne
    private Recipe recipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ingredient() {
    }

    public Ingredient(String ingredient, double amount, String measurement, Double portions) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.portions = portions;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
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

    public Double getPortions() {
        return portions;
    }

    public void setPortions(Double portions) {
        this.portions = portions;
    }
}
