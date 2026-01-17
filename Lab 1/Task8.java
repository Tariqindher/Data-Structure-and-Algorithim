public class Task8{
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
              System.out.println("Vertically  Flipped Array");
              for(int i=r-1; i>=0; i--){
                     for (int j=0; j<c; j++){
                          System.out.print(a[i][j]+"  ");  
                     }
                     System.out.println();
              }
       }
}