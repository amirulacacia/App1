package lesson.lesson8.assignmentjavagenericclasses.genericstack;

import java.util.Arrays;

public class GenericStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;
    
    public GenericStack(){
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void push(T item){
        ensureCapacity();
        array[size++] = item;
    }

    public T pop(){
        if (isEmpty()) {
            System.out.println("There is no item inside the stack");
            return null;
        }else{
            @SuppressWarnings("unchecked")
            T item = (T) array[--size];
            array[size] =null;
            return item;
        }
    }

    public T peek(){
        if (isEmpty()) {
            System.out.println("There is no item inside the stack");
            return null;
        }else{
            @SuppressWarnings("unchecked")
            T item = (T) array[size - 1];
            return item;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity(){
        if (size == array.length) {
            int newCapacity = array.length*2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }
}
