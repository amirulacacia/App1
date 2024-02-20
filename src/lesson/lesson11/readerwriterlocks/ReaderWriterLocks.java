package lesson.lesson11.readerwriterlocks;

public class ReaderWriterLocks {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating multiple reader and writer threads
        for (int i = 0; i < 3; i++) {
            new Thread(new Reader(sharedResource), "Reader-" + i).start();
        }

        for (int i = 0; i < 2; i++) {
            new Thread(new Writer(sharedResource), "Writer-" + i).start();
        }
    }
}
