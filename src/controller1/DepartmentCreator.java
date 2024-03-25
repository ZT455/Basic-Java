package controller1;
import model1.Department;
import model1.Group;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator {


    public Department createDepartment(int countGroups, int maxNumberOfGroups) {

        Department department = new Department();
        GroupCreator groupCreator = new GroupCreator();

        List<Group> listGroups = new ArrayList<>();

        for (int i = 0; i < countGroups; i++) {
            listGroups.add(groupCreator.oneGroup());
        }

        department.setListGroups(listGroups);

        return department;
    }

    public Department createOneDepartment() {

        Department department = createDepartment(2, 5);

        return department;
    }
}

