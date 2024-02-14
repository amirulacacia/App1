package lesson.lesson7.Exercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import lesson.lesson7.Exercise.JsonFile.MainJson;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        String fileName = "examplefile.txt";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" 1.Read File         8.Size of File");
        System.out.println(" 2.Write File        9.Encrypted File");
        System.out.println(" 3.Counting Word    10.Decrypted File");
        System.out.println(" 4.Copy File        11.Read HTTP URL");
        System.out.println(" 5.Append File      12.Pattern Match Text Expression");
        System.out.println(" 6.Search Word      13.Read Json File");
        System.out.println(" 7.Delete File");
        System.out.print("Please enter your choice: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");

        switch (input) {
            case 1:
                readFile(fileName);
                break;
            case 2:
                System.out.print("Please write your text: ");
                writeFile(fileName, scanner.nextLine());
                break;
            case 3:
                countWord(fileName);
                break;
            case 4:
                copyFile(fileName);
                break;
            case 5:
                appendFile(fileName);
                break;
            case 6:
                searchWord(fileName);
                break;
            case 7:
                deleteFile();
                break;
            case 8:
                sizeFile();
                break;
            case 9:
                encryptingFile();
                break;
            case 10:
                decryptingFile();
                break;
            case 11:
                readingURL();
                break;
            case 12:
                matchPattern();
                break;
            case 13:
                jsonReader();
                break;
            default:
                break;
        }

        scanner.close();
    }

    public static void readFile(String fileName) throws IOException {
        ReadFile readFile = new ReadFile(fileName);
        readFile.read();
    }

    public static void writeFile(String fileName, String text) throws IOException {
        WriteFile writeFile = new WriteFile(fileName);
        writeFile.write(text);
    }

    public static void countWord(String fileName) throws IOException {
        WordCount wordCount = new WordCount(fileName);
        wordCount.countWord();
    }

    public static void copyFile(String fileName) throws IOException {
        FileCopy fileCopy = new FileCopy(fileName);
        fileCopy.copy();
    }

    public static void appendFile(String fileName) throws IOException {
        FileAppending fileAppending = new FileAppending(fileName);
        fileAppending.appending();
    }

    public static void searchWord(String fileName) throws IOException {
        WordSearch wordSearch = new WordSearch(fileName);
        wordSearch.searchWord();
    }

    public static void deleteFile() throws FileNotFoundException {
        FileDelete fileDelete = new FileDelete();
        fileDelete.delete();
    }

    private static void sizeFile() throws IOException {
        FileSize fileSize = new FileSize();
        fileSize.size();
    }

    private static void encryptingFile() throws IOException {
        FileEncryption fileEncryption = new FileEncryption();
        fileEncryption.encrypted();
    }

    private static void decryptingFile() throws IOException{
        FileDecryption fileDecryption = new FileDecryption();
        fileDecryption.decrypted();    
    }

    private static void readingURL() throws IOException{
        ReadURL readURL = new ReadURL();
        readURL.read();    
    }

    private static void matchPattern(){
        PatternMatch patternMatch = new PatternMatch();
        patternMatch.patternMatcher();    
    }

    public static void jsonReader() throws IllegalAccessException, IOException{
        MainJson mainJson = new MainJson();
        mainJson.jsonMain();
    }
}
