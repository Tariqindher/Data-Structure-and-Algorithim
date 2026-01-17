// Sample Output
//     Array values are:
//     21, 9, 17, 9, 21, 9
//     The frequency of all elements of the array are:
//     21 occurs 2 times
//     9 occurs 3 times
//     17 occurs 1 times

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] arr = { 45, 45, 45, 45, 70, 45, 60, 60, 60, 50, 50, 50, 50, 80 };
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]\nThe frequency of the array is:");
        frequency(arr);
    }

    static void frequency(int[] arr) {
        Arrays.sort(arr);
        int duplicate = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            System.out.println(arr[i] + " occurred " + count + " times");

            if (count > 1) {
                duplicate++;
            }
        }

        System.out.println("Total number of duplicates: " + duplicate);
    }
}
