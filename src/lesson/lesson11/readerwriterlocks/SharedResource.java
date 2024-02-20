package lesson.lesson11.readerwriterlocks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    private int data = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock(); // provides separate locks for reading and writing,
                                                                     // allowing multiple readers but only one writer at
                                                                     // a time.

    public int readData() {
        lock.readLock().lock(); // acquires the read lock, allowing multiple readers to read concurrently.
        try {
            System.out.println(Thread.currentThread().getName() + " reading data:" + data);
            return data;
        } finally {
            lock.readLock().unlock(); // releases the read lock after reading is done.
        }
    }

    public void writeData(int newValue) {
        lock.writeLock().lock(); // acquires the write lock, allowing only one writer to write at a time.
        try {
            System.out.println(Thread.currentThread().getName() + " writing data:" + newValue);
            data = newValue;
        } finally {
            lock.writeLock().unlock(); // releases the write lock after writing is done.
        }
    }
}
