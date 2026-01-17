//Write a program that that comibine 2 array into 3 third array
public class Task2{
       public static void main(String[] args) {
            int arr[][]={   {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16} 
                     };
                     
                     System.out.println("Print the Elements of an Array");
                     for (int i=0; i<arr.length;i++){
                            System.out.print("[");
                            for(int j=0; j<arr.length; j++){
                                   System.out.print(arr[i][j]+"   ");
                            }
                            System.out.println("]");
                     }

                     //call the extract boundaries method
                     extractBoundaries(arr);
                     //call the centre part 
                     cropCenterPart(arr);
       }
       public static void extractBoundaries (int arr[][]){

              System.out.println("\nPrint the 1st row elements ");
              for(int j=0; j<arr[0].length; j++){
                     System.out.print(arr[0][j]+"  ");
              }
              System.out.println();
              System.out.println("\nPrint the last row elements ");
              for(int j=0; j<arr[0].length; j++){
                     System.out.print(arr[3][j]+"  ");
              }
              System.out.println();

              System.out.println("\nPrint the 1st coloumn elements ");
              for(int i=0; i<arr.length; i++){
                     System.out.print(arr[i][0]+"  ");
              }
              System.out.println();
              System.out.println("\nPrint the last coloumn elements ");
              for(int i=0; i<arr.length; i++){
                     System.out.print(arr[i][3]+"  ");
              }
              System.out.println();


       }

       public static void cropCenterPart (int arr[][]){
              int rows=arr.length;
              int cols=arr[0].length;
              if (rows%2 == 1 && cols%2 == 1) {
                     // Odd dimensions, single center element
                     int centerRow = rows / 2;
                     int centerCol = cols / 2;
                     System.out.println("Center element: " + arr[centerRow][centerCol]);
              }
              else{
                     //for even dimension 4x4 block of center elements
                     int centerRow1 = rows / 2 - 1;
                     int centerRow2 = rows / 2;
                     int centerCol1 = cols / 2 - 1;
                     int centerCol2 = cols / 2;
                     System.out.println("Center elements:");
                     System.out.println(arr[centerRow1][centerCol1] + " " + arr[centerRow1][centerCol2]);
                     System.out.println(arr[centerRow2][centerCol1] + " " + arr[centerRow2][centerCol2]);

              }
       }
}