//Array values are:
//21, 9, 17, 43, 9, 15, 21, 6, 38, 6
//The count of duplicate values is: 3
import java.util.Arrays;
public class Task3{
       public static void main(String[] args) {
              int A[]={2,3,3,5,5,2,3,7,8,5,9,7};
              Arrays.sort(A);
              for(int i=0; i<A.length; i++){
                     System.out.print(A[i]+"   ");
              }
              int count=0;
              boolean isDuplicate=false;
              for(int i=1; i<A.length; i++){
              if(A[i]==A[i-1]){
                     if(!isDuplicate){
                         count++;
                         isDuplicate=true;   
                     }
              }
              else{
                     isDuplicate=false;
              }
              }
              System.out.println("\nTotal Number duplicate value:  "+count);    
       }
}
