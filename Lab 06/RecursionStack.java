class StackRecursive{
       int size=4;
       int index=0;
       int index1=0;
       int Stack[]=new int [size];
       void push(int element){
              
              if(index<size){
              Stack[index++]=element;
              System.out.println("The Value is added in Stack "+element);
              return; 
              }
              isFull();

       }
       int pop(){
              if(index!=0){
              return Stack[--index];
              }
              else{
              System.out.println("Stack is full");
              return -1;
              }
              
       }
       void isEmpty(){
              if(index==0){
                     System.out.println("Stack is empty");
              }
              }
       void isFull(){
              if(index==size){
                     System.out.println("Stack is Full ");
                     return;
              }
       }
       void printALL(){
              System.out.println("All elements of Stack");
              for(int i=index-1; i>=0; i--){
                     System.out.print(Stack[i]+"  ");
              }
              System.out.println();
       }
       void StackReverse(int Stack1[],int index1){
              if(index1==index){
                     return;
              }
              System.out.print(Stack1[index1]+"  ");
              StackReverse(Stack1,index1+1);

       }
}
public class RecursionStack{
       public static void main(String[] args) {
              
       
       StackRecursive obj=new StackRecursive();
       obj.push(45);
       obj.push(46);
       obj.push(47);
       obj.push(48);
       obj.printALL();
       System.out.println();
       System.out.println("Stack in Reverse Order");
       obj.StackReverse(obj.Stack,obj.index1);


       }
}