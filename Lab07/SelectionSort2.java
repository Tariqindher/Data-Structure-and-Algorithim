public class SelectionSort2{
       public static void main(String[] args) {
              int A[]={2,3,6,7,8,4,5};
              for(int i=0; i<A.length; i++){
                     System.out.print(A[i]+"  ");
              }
              for(int i=0; i<A.length; i++){
                     for(int j=i+1; j<A.length;j++){
                            if(A[i]>A[j]){
                                   int t=A[i];
                                   A[i]=A[j];
                                   A[j]=t;
                            }
                     }
              }
              System.out.println();
              for(int i=0; i<A.length; i++){
                     System.out.print(A[i]+"  ");
              }
       }
}