import java.util.Scanner;

public class Task1 {
       static int hash(String input, int tablesize){
              int hashValue=0;
              for(int i=0; i<input.length(); i++){
                     hashValue+=(int)input.charAt(i);//Add ASCII value of each character
              }
              return hashValue%tablesize;
       }
       public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);

              int tablesize=10;
              System.out.println("Enter strings to calculate hash values (type 'exit' to stop):");
              
              //hash(input, tablesize);
              while (true) {
                     System.out.print("Enter string: ");
                     String input = sc.nextLine();
                     
                     if (input.equals("exit")) {
                         break; // Exit the loop if 'exit' is entered
                     }
                     
                     // Calculate the hash value and print it
                     int hashValue = hash(input, tablesize);
                     System.out.println("Hash value for \"" + input + "\" is: " + hashValue);
              }

       }
}
