package RuneLine.GraduateProject;

import jakarta.persistence.*;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_spring")
    private boolean isSpring;

    @Column(name = "is_summer")
    private boolean isSummer;

    @Column(name = "is_fall")
    private boolean isFall;
    @Column(name = "is_winter")
    private boolean isWinter;

    @ManyToOne
    @JoinColumn(name = "recipe_id_fk")
    private Recipe recipe;

    public Season() {
    }

    public Season(boolean isSpring, boolean isSummer, boolean isFall, boolean isWinter) {
        this.isSpring = isSpring;
        this.isSummer = isSummer;
        this.isFall = isFall;
        this.isWinter = isWinter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSpring() {
        return isSpring;
    }

    public void setSpring(boolean spring) {
        isSpring = spring;
    }

    public boolean isSummer() {
        return isSummer;
    }

    public void setSummer(boolean summer) {
        isSummer = summer;
    }

    public boolean isFall() {
        return isFall;
    }

    public void setFall(boolean fall) {
        isFall = fall;
    }

    public boolean isWinter() {
        return isWinter;
    }

    public void setWinter(boolean winter) {
        isWinter = winter;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
