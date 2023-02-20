package RuneLine.GraduateProject;

import jakarta.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="TITLE")
    private String title;

    @Column(name="INSTRUCTION")
    private String instruction;

    @Column(name="INGREDIENT")
    private Ingredient ingredient;

//    private String author;

}
