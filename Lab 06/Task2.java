public class Task2{
       public int Fact(int number){
              if(number==0|| number==1){
                     return 1;
              }
              else{
                     return number*Fact(number-1);
              }
              
       }
       public static void main(String[] args) {
              Task2 fact=new Task2();
              int n=5;
              System.out.println("The Factorial of "+n+"  : "+fact.Fact(n));
              
       }
}