package model;
import java.util.Objects;

public class Student extends Human {
    private int journal;
    public int journal() {
        return journal;
    }
    public void journal(int journal) {
        this.journal = journal;
    }

    @Override
    public String toString() {

        return "Student{" +
                "recordBookNumber=" + journal +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return journal == student.journal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(journal);
    }
}
