public class TestSorting {
    public static void main(String[] args) {
        
        int[] descendingArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] almostSortedArray = {1, 2, 3, 4, 6, 5, 7, 8, 9};

        System.out.println("Sorting Descending Array:");
        bubbleSort(descendingArray);
        selectionSort(descendingArray);
        insertionSort(descendingArray);

        System.out.println("\nSorting Almost Sorted Array:");
        bubbleSort(almostSortedArray);
        selectionSort(almostSortedArray);
        insertionSort(almostSortedArray);
    }

    
}
