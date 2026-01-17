public class Task7{
       int size=6;
       int Stack[]=new int[size];
       int index=-1;
       boolean isempty(){
              return index==-1;
       }
       boolean isfull(){
              return index==size-1;
       }
       void push(int data){
              if(isfull()){
                     System.out.println("Stack is full");
                     return;
              }
              Stack[++index]=data;
              System.out.println("pushed element in stack  "+data);
       }
       int pop(){
              if(isempty()){
                     System.out.println("Stack is empty");
                     return-1;
              }
              System.out.println("poped element form stack  "+Stack[index]);
              return Stack[index--];
       }


       public static void main(String[] args) {
              Task7 stk=new Task7();
              System.out.println("Is stack is empty?  "+stk.isempty());
              stk.push(5);
              stk.push(6);
              stk.push(7);
              stk.push(5);
              stk.push(6);
              stk.push(7);
              System.out.print("Is stack is full?  ");stk.isfull();
              System.out.println();
              System.out.println(stk.pop());
              System.out.println("Is stack is empty?  "+stk.isempty());
       }
}