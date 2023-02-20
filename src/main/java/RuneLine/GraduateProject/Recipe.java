package RuneLine.GraduateProject;

import javax.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String instruction;
    private Ingredient ingredient;
//    private String author;




}
