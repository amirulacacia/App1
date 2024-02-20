package lesson.lesson11.readerwriterlocks;

public class Reader implements Runnable {
    private final SharedResource sharedResource;

    public Reader(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            sharedResource.readData();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
