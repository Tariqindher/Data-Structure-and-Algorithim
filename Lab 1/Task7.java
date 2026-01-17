//Write a program that checks if a 2D array is column-magic (which means that every 
// column has the same column sum)
public class Task7{
       public static void main(String[] args) {
              

              int Arr[][]={{6,0,3},
                           {1,5,4},
                           {5,7,5}};
              System.out.println("Original Array is  ");
              for(int i=0; i<3; i++){
                     for(int j=0; j<3; j++){
                            System.out.print(Arr[i][j]+"  ");
                     }
                     System.out.println();
              }
              int sumC1=0,sumC2=0,sumC3=0;

              for(int i=0; i<3; i++){
                  sumC1+=Arr[i][0];   
              }
              for(int i=0; i<3; i++){
                     sumC2+=Arr[i][1];   
              }
              for(int i=0; i<3; i++){
                     sumC3+=Arr[i][2];   
              }
              if(sumC1==sumC2&&sumC1==sumC3){
                     System.out.println("\nThe Array is Coloumn Magic  ");
              }
              else{
                     System.out.println("\nThe Array not is Coloumn Magic  ");
              }

       }
}