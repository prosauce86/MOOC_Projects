import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] stringsArray = {"apple", "carrot", "banana", "cantaloupe", "strawberry", "grape"};
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i : array) {
            integerArrayList.add(i);
        }

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(stringsArray));

        System.out.print("Array presort: " + Arrays.toString(array));
        sort(array);
        System.out.println();
        System.out.print("Array after sort: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Array presort: " + Arrays.toString(stringsArray));
        sort(stringsArray);
        System.out.println();
        System.out.print("Array after sort: " + Arrays.toString(stringsArray));
        System.out.println();

        System.out.print("ArrayList presort: " + integerArrayList);
        sortIntegers(integerArrayList);
        System.out.println();
        System.out.print("ArrayList after sort: " + integerArrayList);
        System.out.println();

        System.out.print("ArrayList presort: " + stringArrayList);
        sortStrings(stringArrayList);
        System.out.println();
        System.out.print("ArrayList after sort: " + stringArrayList);
        System.out.println();
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}