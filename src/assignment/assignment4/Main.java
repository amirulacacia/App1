package assignment.assignment4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "examplefile.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Read File\n2. Write File\n3. Counting Word");
        System.out.println("4. Copy File\n5. Append File\n6. Search Word");
        System.out.println("7. Delete File\n8. Size of File\n9. Encrypted File");
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
}
