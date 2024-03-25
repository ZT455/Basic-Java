package controller;
import model.Group;
import model.Student;
import java.util.ArrayList;
import java.util.List;

public class GroupCreator {


    Group createGroup(int countStudents, int maxNumberOfStudents) {

        Group group = new Group();

        StudentCreator studentCreator = new StudentCreator();

        List<Student> listStudents = new ArrayList<>();

        for (int i = 0; i < countStudents; i++) {
            listStudents.add(studentCreator.oneStudent());
        }

        group.setStudents(listStudents);

        group.setMaxNumberOfStudents(maxNumberOfStudents);

        return group;
    }

    Group oneGroup() {

        Group group = createGroup(15, 30);

        return group;
    }

}

