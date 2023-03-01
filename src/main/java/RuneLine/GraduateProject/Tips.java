package RuneLine.GraduateProject;

import jakarta.persistence.*;

@Entity
public class Tips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tips;

    @ManyToOne
    @JoinColumn(name = "ingredient_id_fk")
    private Ingredient ingredient;

    public Tips() {
    }

    public Tips(String tips) {
        this.tips = tips;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
