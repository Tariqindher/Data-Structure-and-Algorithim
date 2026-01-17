public class Task3{
       int size=4;
       int index=0;
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
              System.out.println("Stack is empty");
              return -1;
              }
              
       }
       int peek(){
              if(index>0){
              return Stack[index-1];
              }
              else{
                     System.out.println("Stack is empty");
                     return -1;
              }  
       }
       int getSize(){
              System.out.print("The size of Stack  is : ");
              return index;
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
       
       
       public static void main(String[] args) {
              Task3 obj=new Task3();
              obj.push(35);
              obj.push(36);
              obj.push(37);
              obj.push(38);
              obj.push(39);
              obj.push(40);
              //obj.push(39);
              System.out.println("The Value is poped  "+ obj.pop());
              System.out.println("The Value is poped  "+ obj.pop());
              System.out.println("The Value is peeked  "+ obj.peek());
              obj.printALL();
              System.out.println(obj.getSize());
              obj.isEmpty();
              obj.isFull();

              obj.push(3*obj.pop());
             
              obj.printALL();
              obj.push(obj.pop()-2);
              obj.printALL();
       }

}