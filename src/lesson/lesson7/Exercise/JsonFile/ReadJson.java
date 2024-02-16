package lesson.lesson7.exercise.jsonfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJson {
    private String fileName;

    public ReadJson(String fileName) {
        this.fileName = fileName;
    }

    public Person readJsonFile() throws IOException, IllegalAccessException {

        //Files.readAllBytes() = reads all bytes from a file into a byte array.
        String content = new String(Files.readAllBytes(Paths.get(this.fileName)));

        // remove any leading and trailing whitespace characters
        content = content.trim();

        // indicators of a JSON object
        if (!content.startsWith("{") || !content.endsWith("}")) {
            throw new IllegalAccessException("Invalid JSON Format");
        }

        // removes first and last characters from the content string, which are '{' and '}'
        content = content.substring(1, content.length() - 1);

        //splits the content string into an array of key-value pairs based on the comma ","
        //Pair 1 = "name" : "Ali"
        //Pair 2 = "age" : 15
        String[] keyValuePairs = content.split(",");

        //initialize name and age
        String name = null;
        int age = 0;

        //iterates over each key-value pair in the keyValuePairs array.
        for (String pair : keyValuePairs) {

            //splits into key and value
            String[] keyValue = pair.split(":");

            //trim() = removes any leading or trailing whitespace
            //replace = remove the double quote ("")
            String key = keyValue[0].trim().replace("\"", "");
            String value = keyValue[1].trim().replace("\"", "");

            if (key.equals("name")) {
                name = value;
            } else if (key.equals("age")) {
                age = Integer.parseInt(value);
            }
        }

        if (name != null) {
            return new Person(name, age);
        }

        return null;
    }

}
