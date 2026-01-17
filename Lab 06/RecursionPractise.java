public class RecursionPractise{
       public static void print(int a,int Numbers){
              if(a>Numbers){
                     return;
              }
              
              print(a+1, Numbers);
              System.out.println(a);
       }
       public static void PrintArr(char Arr[],int index){
              int size=Arr.length;
              
              if(index>=size){
                     return;
              }
              
              PrintArr(Arr, index+1);
              System.out.print(Arr[index]+"  ");

       }
       public static void printFibonaci(int first,int second, int limit){
              
              if(second>limit){
                     return;
              }
              System.out.print(second+"  ");
              printFibonaci(second,second+first, limit);
              // int a=0, b=1;
              // System.out.print(a+"  ");
              // for(int i=2; i<=n; i++){
              //        System.out.print(b+"  ");
              //        int c=a+b;
              //        a=b;
              //        b=c;
                     
              // }
       }
       public static void main(String[] args) {
              print(1, 5);
              char Arr[]={'T','A','R','I','Q'};
              PrintArr(Arr,0);
              System.out.println();
              System.out.print(0+"  ");
              printFibonaci(0,1,5);
       }
}