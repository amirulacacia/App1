package lesson.lesson7.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadURL {

    // Handle any IOException that may occur during URL connection or coding
    public void read() throws IOException {
        String urlString = "https://www.java.com/en/";

        // Create a URL object with specified URL string
        URL url = new URL(urlString);

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set request method (GET method)
        connection.setRequestMethod("GET");

        // Get a response code
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // Create a BufferedReade to read content from the URL
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        // Read each line of the content and print it to console
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // Close BufferedReader and connection
        reader.close();
        connection.disconnect();
    }
}
