package controller;
import model.Faculty;
import model.Human;
import model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {


    public   University createUniversity(String name, int countFaculties, Human head) {

        University university = new University();
        FacultyCreator facultyCreator = new FacultyCreator();

        university.setName(name);
        university.setHead(head);

        List<Faculty> faculties = new ArrayList<>();

        for (int i = 1; i < countFaculties; i++) {
            faculties.add(facultyCreator.oneFaculty());
        }

        university.setFaculties(faculties);

        return university;

    }

    public  University oneUniversity() {

        HumanCreator humanCreator = new HumanCreator();

        University university = createUniversity("Dnipro University of Technology", 3, humanCreator.oneMan());

        return university;
    }

}
