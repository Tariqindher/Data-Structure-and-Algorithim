public class Task9{
       public static void main (String args[]){
              int a[][]={{1,2,3},{4,5,6},{7,8,9}};
              int r=3, c=3;
              System.out.println("Original Array");
              for(int i=0; i<r; i++){
                     for (int j=0; j<c; j++){
                          System.out.print(a[i][j]+"  ");  
                     }
                     System.out.println();
              }
              System.out.println("Horizantally Flipped Array");
              for(int i=0; i<r; i++){
                     for (int j=c-1; j>=0; j--){
                          System.out.print(a[i][j]+"  ");  
                     }
                     System.out.println();
              }
       }
}