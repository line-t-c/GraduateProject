package RuneLine.GraduateProject;

import jakarta.persistence.*;

@Entity
public class Instruction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String step;

    @ManyToOne
    private Recipe recipe;

    public Instruction() {
    }

    public Instruction(String step) {
        this.step = step;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
}
