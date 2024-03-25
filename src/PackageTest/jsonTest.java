package PackageTest;

import controller.UniversityCreator;
import model.University;
import LR4.JsonManager;

import org.junit.Test;
import org.junit.Assert;

public class jsonTest {
    @Test
    public void testFileWriteJsonToFile() {

        String filePath = "./src/firstJSON.json";

        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();

        University oldUniversity = universityCreator.oneUniversity();

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);

        Assert.assertEquals(newUniversity, oldUniversity);
    }
}
