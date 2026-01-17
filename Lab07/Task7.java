public class Task7{
       public static void main(String[] args) {
              int A[]={1,2,3,4,5,6};
              int O[]=new int[A.length];
              for(int i:A){
                     System.out.print(i+"  ");
              }
              System.out.println();
              int even=0, odd=1;
              for(int i=0; i<A.length; i++){
                     if(A[i]%2==0){
                            O[even]=A[i];
                            even=even+2;     
                     }
                     else{
                            O[odd]=A[i];
                            odd=odd+2;      
                     }
              }
              System.out.println("Arrange order Even elements on Even index @ odd Elements on odd index ");
              for(int i:O){
                     System.out.print(i+"  ");
              }
       }
}