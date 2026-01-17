 class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }
        System.out.println("Selection Sort: Comparisons = " + comparisons + ", Swaps = " + swaps);
    }
}
