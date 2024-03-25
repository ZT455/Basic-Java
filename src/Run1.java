import controller1.UniversityCreator;
import model1.University;

public class Run1 {

    public static void main(String[] args) {

        UniversityCreator universityCreator = new UniversityCreator();

        University university = universityCreator.oneUniversity();

        System.out.println(university.toString());
    }

}
