public class Task3{
       public static void Fibonacci(int a, int b, int n){
              if(n<1) {
                     return;
                     }
               System.out.print(a+" ");
                     Fibonacci(b, a+b, n-1);

       }

       public static void main(String[] args) {
              
              Fibonacci(0, 1, 7);
       }
}