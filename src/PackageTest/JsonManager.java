package PackageTest;

import com.google.gson.Gson;
import model1.University;

import java.io.*;

public class JsonManager {

    public void writeToJson(Object o, String filePath) {

        Gson gson = new Gson();

        String jsonFile = gson.toJson(o);

        try {
            FileWriter myWriter = new FileWriter(filePath);

            myWriter.write(jsonFile);
            myWriter.close();

            System.out.println("Successfully written to the file");

        } catch (IOException e) {

            System.out.println("Error");

            e.printStackTrace();
        }
    }

    public Object readFromJson(String filePath) {

        Gson gson = new Gson();

        try {

            return gson.fromJson(new FileReader(filePath), University.class);
        } catch (FileNotFoundException e) {

            System.out.println("Error");

            e.printStackTrace();
        }
        return null;
    }
}

