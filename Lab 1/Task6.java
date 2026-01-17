// Write a program that checks if a 2D array is row-magic (which means that every row 
// has the same row sum).
public class Task6{
       public static void main(String[] args) {

              int Arr[][]={{6,2,3},{2,5,4},{5,5,1}};
              System.out.println("Original Array is  ");
              for(int i=0; i<3; i++){
                     for(int j=0; j<3; j++){
                            System.out.print(Arr[i][j]+"  ");
                     }
                     System.out.println();
              }
              int sumR1=0,sumR2=0,sumR3=0;

              for(int i=0; i<3; i++){
                  sumR1+=Arr[0][i];   
              }
              for(int i=0; i<3; i++){
                     sumR2+=Arr[1][i];   
              }
              for(int i=0; i<3; i++){
                     sumR3+=Arr[2][i];   
              }
              if(sumR1==sumR2&&sumR1==sumR3){
                     System.out.println("\nThe Array is Row Magic  ");
              }
              else{
                     System.out.println("\nThe Array not is Row Magic  ");
              }

       }
}