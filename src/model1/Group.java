package model1;

import java.util.List;
import java.util.Objects;

public class Group  {

    private int maxNumberOfStudents;
    List<Student> listStudents;

    public List<Student> getListStudents() {
        return listStudents;
    }
    public void setStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    @Override
    public String toString() {

        return "Group{" +
                "maxNumberOfStudents=" + maxNumberOfStudents +
                ", students=" + listStudents.toString() +
                '}';

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Group)) return false;

        Group group = (Group) o;

        return maxNumberOfStudents == group.maxNumberOfStudents &&
                listStudents.equals(group.listStudents);
    }

    @Override
    public int hashCode() {

        return Objects.hash(maxNumberOfStudents, listStudents);
    }
}
