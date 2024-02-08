package lesson.lesson3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringManipulator {
    private ArrayList<String> arrayList;

    public ArrayListStringManipulator(){
        arrayList = new ArrayList<>();
    }

    public void addElement(String element){
        arrayList.add(element);
    }

    public ArrayList<String> getArrayList(){
        return arrayList;
    }

    public void removeElementByString(String element){
        arrayList.remove(element);
    }

    public void removeElementByIndex(int i){
        arrayList.remove(i);
    }

    public int searchElement(String element){
        return arrayList.indexOf(element);
    }

    public void sortList(){
        Collections.sort(arrayList);
    }

    public static void main(String[] args) {
        ArrayListStringManipulator arrayListStringManipulator = new ArrayListStringManipulator();

        arrayListStringManipulator.addElement("Orange");
        arrayListStringManipulator.addElement("Strawberry");
        arrayListStringManipulator.addElement("Apple");
        arrayListStringManipulator.addElement("Pineapple");
        arrayListStringManipulator.addElement("Mango");
        arrayListStringManipulator.addElement("Dragon Fruit");
        arrayListStringManipulator.addElement("Banana");
        System.out.println(arrayListStringManipulator.getArrayList().toString());

        arrayListStringManipulator.removeElementByString("Pineapple");
        System.out.println(arrayListStringManipulator.getArrayList().toString());

        arrayListStringManipulator.removeElementByIndex(4);
        System.out.println(arrayListStringManipulator.getArrayList().toString());

        arrayListStringManipulator.sortList();
        System.out.println(arrayListStringManipulator.getArrayList().toString());

    }
}
