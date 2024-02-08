package lesson.lesson3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListManipulator {

    private ArrayList<Integer> arrayList;
    public static void main(String[] args) {
        ArrayListManipulator arrayListManipulator = new ArrayListManipulator();
        arrayListManipulator.addElement(90);
        arrayListManipulator.addElement(100);
        arrayListManipulator.addElement(150);
        arrayListManipulator.addElement(50);
        arrayListManipulator.addElement(20);
        System.out.println(arrayListManipulator.getArrayList());

        arrayListManipulator.removeElementByIndex(1);
        System.out.println(arrayListManipulator.getArrayList());

        System.out.println(arrayListManipulator.searchElement(150));

        arrayListManipulator.sortList();
        System.out.println(arrayListManipulator.getArrayList());
    }

    public ArrayListManipulator(){
        arrayList = new ArrayList<>();
    }

    //Mehthod to add an element to the ArrayList
    public void addElement(int element){

        // controls
        arrayList.add(element);
    }

    //Method to remove an element by VALUE from the ArrayList
    public void removeElementByValue(int element){
        //The Integer.valueOf(element) were seen as Object
        //due to the Integer function, so the function 
        //of arrayList.remove will be override in terms of
        //object
        arrayList.remove(Integer.valueOf(element));
    }

    //Method to remove an element by INDEX from the ArrayList
    public void removeElementByIndex(int element){
        //The element were seen as integer, therefore
        //the function of arrayList.remove will be override 
        //in terms of integer
        arrayList.remove(element);
    }

    public ArrayList<Integer> getArrayList(){
        return arrayList;
    }

    public int searchElement(int element){
        return arrayList.indexOf(element);
    }

    public void sortList() {
        Collections.sort(arrayList);

    }

}
