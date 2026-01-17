public class DuplicateCount{
       public static void main(String args[]){
              int Arr[]={2,4,4,3,2,5,6,2,7,7,8,8,8};
              System.out.println("All elements of the array");
              System.out.println();
              for(int i=0; i<Arr.length; i++){
                     System.out.print(Arr[i]+"  ");
              }
              System.out.println();
          ;
              System.out.println("Numbers of Duplicate value counted ");
              System.out.println(countNumbers(Arr));



       }
      
       public static int countNumbers(int A[]){
              int count=0;
              for(int i=0; i<A.length-1; i++){
                     for(int j=i+1; j<A.length-1-i; j++){
                            if(A[i]==A[j]){
                                   count++;
                            }
                     }
              }
              return count;
       }
}