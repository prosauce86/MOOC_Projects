
import hashMap.HashMap;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.add("Name", 32);
        System.out.println(hashMap.get("Name"));

    }

}