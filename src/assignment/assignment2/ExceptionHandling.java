package assignment.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome user! Please enter your name?");

        String firstName, secondName;

        firstName = reader.readLine();
        secondName = reader.readLine();
    
        reader.close();
        System.out.println("Good to see you " + firstName + secondName);
    }
}
