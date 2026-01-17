public class Task2 {

    public static void main(String[] args) {
        int[] array1 = {5, 8, 12, 1, 7};
        int[] array2 = {4, 9, 3, 15, 6};
        
        System.out.println("Array 1: ");
        printArray(array1);
        
        System.out.println("Array 2: ");
        printArray(array2);
        
        int[] mergedArray = new int[array1.length + array2.length];
        
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        
        sortArray(mergedArray);
        
        System.out.println("Merged and Sorted Array: ");
        printArray(mergedArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
