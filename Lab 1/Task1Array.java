//Write a program to copy the elements of one array into another array but in reverse 
//order. For example, if the first array contains the values 1, 2, 3, 4, 5 then the second 
//array should contain the values (after copying from the first array) 5, 4, 3, 2, 1.
import java.util.*;

public class Task1Array{
       public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the size of an Array");
              int size=sc.nextInt();
              int A1[]=new int[size];
              for(int i=0; i<A1.length; i++){
                     System.out.println("Enter the  value  No "+(i+1)+"  :");
                     A1[i]=sc.nextInt();
              }
              for(int i=0; i<A1.length; i++){
                     System.out.print(" "+A1[i]+"  ");     
              }
              System.out.println("\n2nd Array ");
              int A2[]=new int[size];
              for(int i=0; i<A2.length;i++){
                     A2[i]=A1[--size];
              }
              for(int i=0; i<A1.length; i++){
                     System.out.print(" "+A2[i]+"  ");
                     
              }



       }
}