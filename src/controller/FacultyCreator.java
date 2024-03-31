package controller;
import model.Department;
import model.Faculty;
import model.Human;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {

    Faculty createFaculty(int countDepartments, int maxNumberOfDepartment, Human head) {

        Faculty faculty = new Faculty();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        List<Department> listDepartments = new ArrayList<>();

        for (int i = 0; i < countDepartments; i++) {
            listDepartments.add(departmentCreator.createOneDepartment());
        }

        faculty.setDepartments(listDepartments);
        faculty.setNumberOfDepartment(maxNumberOfDepartment);
        faculty.setHead(head);

        return faculty;
    }

    Faculty oneFaculty() {

        HumanCreator humanCreator = new HumanCreator();

        Faculty group = createFaculty(2, 3, humanCreator.oneMan());

        return group;
    }
}

