//Sample Output

//    Original array is:
//    21, 9, 17, 43, 9, 15, 21, 6, 38, 6
//    Array after removing duplicates is:
//    21, 9, 17, 43,15, 6, 38
//    The size of the original arrays was: 10
//    The size of the new arrays is: 7

import java.util.Arrays;

public class Task4 {
    public static void main(String[] arsg) {
        int[] arr = { 45, 45, 85, 60, 60, 60, 50, 50, 50, 50 };
        System.out.println("Original Array");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray after removing duplicates is:");
        int[] duplicateRemoved = removeDuplicat(arr);
        for (int i = 0; i < duplicateRemoved.length; i++) {
            System.out.print(duplicateRemoved[i] + " ");
        }

        
        System.out.println("\nThe size of original array is: " + arr.length);
        System.out.println("The size of new array is: " + duplicateRemoved.length);

    }

    static int[] removeDuplicat(int[] arr) {
        Arrays.sort(arr);
        int[] temp = new int[arr.length];

        int duplicate = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                temp[duplicate++] = arr[i];

                do {
                    i++;
                } while (i < arr.length - 1 && arr[i] == arr[i + 1]);

            }
        }

        int[] result = new int[duplicate];

        for (int i = 0; i < duplicate; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
