public class SortComparison {
    
    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) break; // If no two elements were swapped, break the loop
        }
        System.out.println("Bubble Sort - Comparisons: " + comparisons + ", Swaps: " + swaps);
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }
        System.out.println("Selection Sort - Comparisons: " + comparisons + ", Swaps: " + swaps);
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            comparisons++; // At least one comparison for each iteration
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                comparisons++; // Another comparison inside while
                swaps++;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort - Comparisons: " + comparisons + ", Swaps: " + swaps);
    }

    // Main method to run the tests
    public static void main(String[] args) {
        // Initial array for sorting in descending order
        int[] descendingArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        // Initial array for sorting almost sorted array
        int[] almostSortedArray = {1, 2, 3, 5, 4, 6, 7, 8, 9};

        System.out.println("Sorting Descending Array:");
        // Sort descending array using each algorithm
        bubbleSort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        selectionSort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        insertionSort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});

        System.out.println("\nSorting Almost Sorted Array:");
        // Sort almost sorted array using each algorithm
        bubbleSort(new int[]{1, 2, 3, 5, 4, 6, 7, 8, 9});
        selectionSort(new int[]{1, 2, 3, 5, 4, 6, 7, 8, 9});
        insertionSort(new int[]{1, 2, 3, 5, 4, 6, 7, 8, 9});
    }
}
