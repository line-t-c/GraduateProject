package RuneLine.GraduateProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String instruction;
    //private Ingredient ingredient;

    public String getMessage(String test) {
        return "Hello " + test;
    }
//    private String author;




}
