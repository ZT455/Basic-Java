package model1;

import java.util.List;
import java.util.Objects;

public class University {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Human head;
    public Human getHead() {
        return head;
    }
    public void setHead(Human head) {
        this.head = head;
    }

    private List<Faculty> listFaculties;
    public List<Faculty> getFaculties() {
        return listFaculties;
    }
    public void setFaculties(List<Faculty> listFaculties) {
        this.listFaculties = listFaculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", faculties=" + listFaculties +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof University)) return false;

        University that = (University) o;

        return Objects.equals(name, that.name) &&
                Objects.equals(head, that.head) &&
                Objects.equals(listFaculties, that.listFaculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, listFaculties);
    }
}

