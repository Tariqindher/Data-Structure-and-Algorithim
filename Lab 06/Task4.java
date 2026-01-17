import java.util.Stack;

public class Task4{
       int size=4;
       int stack[]=new int[size];
       int index=-1;
        void push(int data){
              if(index<=size-1){
                     stack[++index]=data;
                     System.out.println("The value is pushed  at index  "+index+ "  "+data);
                     return;  
       }
             
       }
       public void RStack(){
              for(int i=0; i<=index; i++){
                     System.out.print(stack[i]+"  ");
              }
       }
       public static void main(String[] args) {
              Task4 obj=new Task4();
              obj.push(5);
              obj.push(6);
              obj.push(7);
              //obj.push(8);
              obj.push(8);
              obj.RStack();

       }
}