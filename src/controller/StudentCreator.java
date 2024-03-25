package controller;
import model.Human;
import model.Student;

public class StudentCreator {


    public Student createStudent(Human human, int journal) {


        Student student = new Student();
        student.setName(human.getName());
        student.setSurname(human.getSurname());
        student.setPatronymic(human.getPatronymic());

        student.journal(journal);
        student.setSex(human.getSex());

        return student;
    }

    public Student oneStudent() {

        HumanCreator humanCreator = new HumanCreator();

        Human oneMan = humanCreator.oneMan();

        Student oneStudent = createStudent(oneMan, 1);

        return oneStudent;
    }

}


