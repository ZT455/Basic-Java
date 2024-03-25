package controller1;

import model1.Human;
import model1.Student;

public class StudentCreator {
    int i = 0;

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

        i = i + 1;
        Student oneStudent = createStudent(oneMan, i);

        return oneStudent;
    }
    public Student secondStudent() {

        HumanCreator humanCreator = new HumanCreator();

        Human oneWoman = humanCreator.oneWoman();

        Student secondStudent = createStudent(oneWoman, 1);

        return secondStudent;
    }

}


