package controller;
import model.Human;
import model.Sex;

public class HumanCreator {
    public Human createHuman(String name, String surname, String patronymic, Sex sex) {

        Human human = new Human();
        human.setName(name);
        human.setPatronymic(patronymic);
        human.setSex(sex);
        human.setSurname(surname);

        return human;
    }
    public  Human oneMan(){

        return createHuman("Walter","White","Jameson",Sex.MALE);
    }
    public  Human oneWoman(){

        return createHuman("Claudia","Welloy","J",Sex.FEMALE);
    }
}

