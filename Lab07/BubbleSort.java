public class BubbleSort{

       public static void main(String[] args) {
              int A[]={22,11,33,66,011};
              for(int i=0; i<A.length; i++){
                     System.out.print(A[i]+"   ");
              }
              System.out.println("After Sorting");
              BSort(A);
              for(int i=0; i<A.length; i++){
                     System.out.print(A[i]+"   ");
              }

              
       }
       public static void BSort(int A[]){
              for(int i=0; i<A.length; i++){
                     for(int j=0; j<A.length-i-1; j++){
                            if(A[j]>A[j+1]){
                            int temp=A[j];
                            A[j]=A[j+1];
                            A[j+1]=temp;

                            }
                     }
              }
       }
}