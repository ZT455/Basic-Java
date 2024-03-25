package PackageTest;

import controller1.UniversityCreator;
import model1.University;

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
