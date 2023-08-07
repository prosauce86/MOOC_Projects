import java.sql.Array;
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 12, 9, 8, 6, 0, 4, 10, 3, 5};
        /*
        System.out.println("Smallest number: " + smallest(array));
        System.out.println("Index of smallest number: " + indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 0));
        System.out.println(indexOfSmallestFrom(array, 1));
        System.out.println(indexOfSmallestFrom(array, 2));


        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 0, 3);
        System.out.println(Arrays.toString(array));

         */
        sort(array);
    }

    // find the smallest value in the array
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    // find the index of the smallest value in an array
    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) return i;
        }
        return -1;
    }

    // find index of smallest value in array starting from a certain index
    public static int indexOfSmallestFrom(int[] array, int startIndex) {

        int subArrayStartIndex = startIndex;
        int[] subArray = new int[array.length - startIndex];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = array[subArrayStartIndex];
            subArrayStartIndex++;
        }
        return startIndex + indexOfSmallest(subArray);
    }

    // swap array positions for 2 provided indexes
    public static void swap(int[] array, int index1, int index2) {
        //System.out.println("index1 = " + index1);
        //System.out.println("index2 = " + index2);
        int tmp;
        tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    // sort array by swapping positions of current loop index with the smallest value in the remaining array
    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}