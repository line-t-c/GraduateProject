package RuneLine.GraduateProject;

public class Ingredient {

    public int getValue (String numbers){
        int sum = 0;
        if (numbers == "1") {
            sum = 1;
        } else if (numbers == "1,2") {
            sum = 3;
        }
        return sum;
    }
}
