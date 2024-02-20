package lesson.lesson11.readerwriterlocks;

public class Writer implements Runnable{
    private final SharedResource sharedResource;

    public Writer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            sharedResource.writeData(value);
            value++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
