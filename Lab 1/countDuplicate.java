public class countDuplicate {
       public static void main(String[] args) {
           int a[] = {5, 4, 3, 2, 14, 3, 2, 1};
           int n = a.length;
           boolean visited[] = new boolean[n];
   
           // Print array elements
           System.out.println("Array elements:");
           for (int i : a) {
               System.out.print(i + "  ");
           }
           System.out.println("\n\nElement Frequencies:");
           for (int i = 0; i < n; i++) {
               if (!visited[i]) {
                   int count = 1; // Initialize count for current element
                   for (int j = i + 1; j < n; j++) {
                       if (a[i] == a[j]) {
                           count++;
                           visited[j] = true; // Mark the duplicate element as visited
                       }
                   }
                   // Print the element and its frequency
                   System.out.println("Element: " + a[i] + ", Frequency: " + count);
               }
           }
       }
}
   