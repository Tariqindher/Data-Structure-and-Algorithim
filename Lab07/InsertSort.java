public class InsertSort {
       public static void insertion(int A[]) {
           int j, value;
           for (int i = 1; i < A.length; i++) {
               value = A[i];
               j = i - 1;
               // Move elements of A[0..i-1] that are greater than value
               // to one position ahead of their current position
               while (j >= 0 && A[j] > value) {
                   A[j + 1] = A[j];
                   j--;
               }
               A[j + 1] = value; // Place the value in the correct position
           }
       }
   
       public static void main(String args[]) {
           int[] Arr = {5, 2, 3, 6, 7, 9, 5};
           System.out.println("Array before sorting:");
           for (int i : Arr) {
               System.out.print(i + " ");
           }
           System.out.println();
   
           insertion(Arr); // Sort the array
   
           System.out.println("Array after sorting:");
           for (int i : Arr) {
               System.out.print(i + " ");
           }
       }
   }
   