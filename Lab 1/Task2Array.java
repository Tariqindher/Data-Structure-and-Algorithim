
import java.util.Scanner;
public class Task2Array{
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in); 
           System.out.println("Enter the size of 1st Array ");
           int size1=sc.nextInt();
           int A[]=new int[size1];
           for(int i=0; i<size1;i++){
              System.out.println("Enter the value No "+(i+1)+" :  ");
              A[i]=sc.nextInt();
           }
           System.out.println("Enter the size of 2nd Array ");
           int size2=sc.nextInt();
           int B[]=new int[size2];

           for(int i=0; i<size2;i++){
              System.out.println("Enter the value No "+(i+1)+" :  ");
              B[i]=sc.nextInt();
           }
           System.out.println("The Values of First Array");
           for(int i=0; i<size1;i++){
              
             System.out.print(A[i]+"  ");
           }
           System.out.println("\n The Values of Second Array ");
           for(int i=0; i<size2;i++){
              
              System.out.print(B[i]+"  ");
            }
            System.out.println("\nThe Values of the 3rd Array\n Combine 1st and 2nd Array");
            int C[]=new int[(size1+size2)];
            for(int i=0; i<size1;i++){
              C[i]=A[i];
            }
            for(int i=0; i<size2;i++){
              C[size1++]=B[i];
            }
            for(int i=0; i<C.length;i++){
              System.out.print(C[i]+"   ");
            }
           
       }

}