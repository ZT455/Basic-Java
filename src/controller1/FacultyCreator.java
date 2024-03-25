package controller1;
import model1.Department;
import model1.Faculty;
import model1.Human;

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

    public Faculty oneFaculty() {

        HumanCreator humanCreator = new HumanCreator();

        Faculty group = createFaculty(3, 3, humanCreator.oneMan());

        return group;
    }
}

