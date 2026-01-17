import java.util.Arrays;

public class MissingNumbersFinder {
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 8, 2};

        // Step 1: Sort the array
        Arrays.sort(A);

        System.out.print("Missing numbers: ");
        
        // Step 2: Find missing numbers between consecutive elements
        for (int i = 1; i < A.length; i++) {
            int current = A[i];
            int previous = A[i - 1];

            // If there's a gap, add all numbers in between
            for (int missing = previous + 1; missing < current; missing++) {
                System.out.print(missing + " ");
            }
        }
    }
}

