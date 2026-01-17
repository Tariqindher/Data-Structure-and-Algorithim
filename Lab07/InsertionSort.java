 class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    swaps++;
                } else {
                    break;
                }
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort: Comparisons = " + comparisons + ", Swaps = " + swaps);
    }
}
