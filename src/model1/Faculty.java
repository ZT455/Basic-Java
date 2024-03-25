package model1;

import java.util.List;
import java.util.Objects;

public class Faculty extends Object {
    private Human head;

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    private int maxNumberOfDepartment;

    public int getNumberOfDepartment() {
        return maxNumberOfDepartment;
    }

    public void setNumberOfDepartment(int maxNumberOfDepartment) {
        this.maxNumberOfDepartment = maxNumberOfDepartment;
    }

    private List<Department> listDepartments;

    public List<Department> getListDepartments() {
        return listDepartments;
    }
    public void setDepartments(List<Department> listDepartments) {
        this.listDepartments = listDepartments;
    }

    @Override
    public String toString() {

        return "Faculty{" +
                "boss=" + head +
                ", maxNumberOfDepartment=" + maxNumberOfDepartment +
                ", departments=" + listDepartments +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Faculty)) return false;

        Faculty faculty = (Faculty) o;

        return maxNumberOfDepartment == faculty.maxNumberOfDepartment &&
                head.equals(faculty.head) &&
                listDepartments.equals(faculty.listDepartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, maxNumberOfDepartment, listDepartments);
    }
}

