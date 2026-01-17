import java.util.*;
public class RemoveDuplicate{
       public static void main(String[] args) {
              int a[]={5,2,3,5,1,4,9,2,7,3,6};
              int count=0;
              System.out.println(Arrays.toString(a));
              int ar[]=removeDuplicates(a);
              System.out.println(Arrays.toString(ar)); 
       }
       public static int[] removeDuplicates(int[] array) {
              // Sort the array to bring duplicates together
              Arrays.sort(array);
      
              // Count unique elements
              int uniqueCount = 1; // First element is always unique
              for (int i = 1; i < array.length; i++) {
                  if (array[i] != array[i - 1]) {
                      uniqueCount++;
                  }
              }
      
              // Create new array for unique elements
              int[] uniqueArray = new int[uniqueCount];
              uniqueArray[0] = array[0]; // First element is unique
              int index = 1;
      
              // Add unique elements to the new array
              for (int i = 1; i < array.length; i++) {
                  if (array[i] != array[i - 1]) {
                      uniqueArray[index++] = array[i];
                  }
              }
      
              return uniqueArray;
       }
}