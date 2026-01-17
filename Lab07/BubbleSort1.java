 class BubbleSort1{
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) break;
        }
        System.out.println("Bubble Sort: Comparisons = " + comparisons + ", Swaps = " + swaps);
    }
}
