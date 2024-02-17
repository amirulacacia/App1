package lesson.lesson8.assignmentjavagenericclasses.genericmaximizer;

import java.util.Comparator;

public class Maximizer<T> {
    T[] items;

    public Maximizer(T[] items){
        this.items = items;
    }

    public T max(Comparator<T> comparator){
        if (items == null || items.length == 0) {
            System.out.println("The array is empty");
            return null;
        }else{
            T maxElement = items[0];
            for(T element : items){
                if (comparator.compare(element, maxElement) > 0) {
                    maxElement = element;
                }
            }
            return maxElement;
        }
    }
}
