package lesson.lesson7.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDecryption {
    private String fileName;
    private String line;

    public FileDecryption(){

    }

    public void decrypted() throws IOException{
        Scanner scanner = new Scanner(System.in);
        int shift = 5;

        System.out.println("Please enter the file that need to be encrypted: ");
        this.fileName = scanner.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        System.out.println("The file being decrypted!");
        
        while ((line = reader.readLine()) != null) {
            String decryptedLine = decryptingChar(line, shift);
            System.out.println(decryptedLine);
        }

        reader.close();
        scanner.close();
    }

    public String decryptingChar(String text, int shift){
        StringBuilder decryptedText = new StringBuilder();

        for(char character: text.toCharArray()){
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A' ;
                decryptedText.append((char) ((character - base - shift + 26) % 26 + base));
            }else{
                decryptedText.append(character);
            }
        }
        return decryptedText.toString();
    }
}
