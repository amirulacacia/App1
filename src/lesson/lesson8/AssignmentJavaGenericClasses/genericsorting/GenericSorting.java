package lesson.lesson8.assignmentjavagenericclasses.genericsorting;

import java.util.Arrays;
import java.util.Scanner;

// extends Comparable<T>: This is a bound on the generic type T.
// It specifies that T must be a type that implements the Comparable<T> interface.
// Comparable<T> interface: This interface in Java is used for objects that can be 
// compared with other objects of the same type. It defines a method compareTo(T other) 
// that is used to determine the natural ordering of the objects.
public class GenericSorting<T extends Comparable<T>> {

    public void sort(T[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. QuickSort\n2. MergeSort");
        System.out.print("Choose which sort: ");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Sorting using QuickSort...");
                quickSort(array, 0, array.length - 1);
                break;
            case 2:
                System.out.println("Sorting using MergeSort...");
                mergeSort(array, 0, array.length - 1);
                break;
            default:
                break;
        }
        scanner.close();

    }

    private void mergeSort(T[] array, int low, int high) {
        
        if (high > low) { // base case (To stop the looping)

            int mid = (low + high) / 2; // index of middle array (To separate array into 2 halves)

            // Recursively sort the two halves
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);

            // Merge the sorted halves
            merge(array, low, mid, high);
        }
    }

    private void merge(T[] array, int low, int mid, int high) {
        int leftSize = mid - low + 1; // size of left array
        int rightSize = high - mid; // size of right array

        // Create temporary arrays for the left and right halves
        T[] leftArray = Arrays.copyOfRange(array, low, low + leftSize);
        T[] rightArray = Arrays.copyOfRange(array, mid + 1, mid + 1 + rightSize);

        int i = 0; // left array index
        int j = 0; // right array index
        int k = low; // arrays index

        // Merge the two halves back into the original array
        while (i < leftSize && j < rightSize) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copy any remaining elements from leftArray
        while (i < leftSize) {
            array[k++] = leftArray[i++];
        }

        // Copy any remaining elements from rightArray
        while (j < rightSize) {
            array[k++] = rightArray[j++];
        }

    }

    private void quickSort(T[] array, int start, int end) {
        if (start < end) { // base case (To stop the looping)

            int pivot = partition(array, start, end); // Calling the partition to sort the lower value left of the pivot
                                                      // and high value right of pivot (value that lower or higher than
                                                      // pivot).

            // Then called for quickSort method again which will cause looping until the end
            // index are lower or same as start index.
            quickSort(array, start, pivot - 1); // This will sort the lower value of array.
            quickSort(array, pivot + 1, end); // This will sort the high value of array
        }

    }

    private int partition(T[] array, int start, int end) {
        T pivot = array[end]; // The pivot will be the last value of array
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        T temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
