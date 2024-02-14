package lesson.lesson7.Exercise.JsonFile;

import java.io.IOException;

public class MainJson {
    private String jsonFileName = "infoPerson.json";

    public void jsonMain() throws IllegalAccessException, IOException{
        ReadJson readJson = new ReadJson(jsonFileName);
        Person person = readJson.readJsonFile();

        if (person != null) {
            System.out.println(person);
        }
    }
}
