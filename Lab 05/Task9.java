public class Task9{
       int size=4;
       int index=-1;
       int Stack[]=new int [size];
       void push(int element){
              
              if(index<size-1){
                   Stack[++index]=element;
                   System.out.println("The Value is added in Stack "+element);
                   return; 
              }
              System.out.println("Stack is full  you can't add more elemnts ");
       }
       int getMinimum(){
              int min=Stack[index];
              for(int i=index-1; i>=0; i--){
                     if(Stack[i]<min){
                            min=Stack[i];
                     }
              }
              return min;

       }
       public static void main(String[] args) {
              Task9 stack=new Task9();
              stack.push(7);
              stack.push(55);
              stack.push(6);
              stack.push(75);
              stack.push(7);
              System.out.println(stack.getMinimum());
              
              
       }
}