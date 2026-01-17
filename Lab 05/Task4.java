class Node{
       Node next;
       int data;
       public Node(int data){
              this.data=data;
              next=null;
       }      
}
public class Task4{
       Node head;
       int size;
       public void push(int data){
              Node newNode=new Node(data);
              size++;
              if(head==null){
                     head=newNode;
                     System.out.println("The value pushed in Stack "+data);
                     return;
              }
              Node temp=head;
              while (temp.next!=null) {
                     temp=temp.next;
              }
              temp.next=newNode;
              System.out.println("The value pushed in Stack "+data);
       }
       public int pop(){
              size--;
              if(head==null){
                     System.out.println("Stack is Empty");
              }
              Node temp=head;
              while (temp.next.next!=null) {
                     temp=temp.next;
              }
              int a=temp.next.data;
              temp.next=null;
              return a;
       }
       public int peek(){
              if(head==null){
                     System.out.println("Linked list is empty");
              }
              Node temp=head;
              while (temp.next!=null) {
                     temp=temp.next;
              }
              return temp.data;
       }
       public int getSize(){
              return size;
       }
       public boolean isEmpty(){
              return head==null;
       }
       void stackReverse(){
              Node prev=null;
              Node current=head;
              Node  next=null;
               while (current!=null) {
                     next=current.next;//Store next node
                     current.next=prev;//Reverse Linked List
                     prev=current;
                     current=next;//make new Currrent
              }
              
              head=prev;
       }
       public void printAll(){
              if(isEmpty()){
                     System.out.println("Stack is Empty");
                     return;
              }
              Node temp=head;
              while (temp!=null) {
                     System.out.print(temp.data+"   ");
                     temp=temp.next;
              }
              System.out.println();
       }
       public static void main(String[] args) {
              Task4 stack=new Task4();

              stack.push(2);
              stack.push(3);
              stack.push(4);
              stack.push(45);
              System.out.println("The value poped  "+stack.pop());
              System.out.println("The Value peeked  "+stack.peek());
              System.out.println("The total size of Stack: "+stack.getSize());
              System.out.println("The Stack is Empty?  : "+stack.isEmpty());
              stack.stackReverse();
              stack.printAll();

              
       }
}