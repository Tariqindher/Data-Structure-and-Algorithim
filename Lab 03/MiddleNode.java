class  Node {
       int data;
       Node next;
       Node (int data){
            this.data=data;
            this.next=null;      
       }     
}
public class MiddleNode{
       Node head;
       int size=0;
       void addFront(int data){
              size++;
              Node newNode=new Node(data);
              if(head==null ){
                     head=newNode;
                     return;
              }
              newNode.next=head;
              head=newNode;
       }
       public void RemoveMiddle(){
              Node slow=head;
              Node fast=head;
              Node prev=null;
              while(fast!=null && fast.next!=null){
                     prev=slow;
                     fast=fast.next.next;
                     slow=slow.next;
              }
              //'slow' is now pointing to the middle node, and 'prev' is pointing to the node before it.
              prev.next=slow.next;


       }
       public  void Middle(){
              if(head==null){
                     System.out.println("Linked list is empty");
              }
              Node slow=head;
              Node fast=head;
              while(fast!=null && fast.next!=null){
                     fast=fast.next.next;
                     slow=slow.next;
              }
              System.out.println("Here all Nodes with after Middle Nodes ");
              while (slow!=null) {
                     System.out.print(slow.data+" > ");
                     slow=slow.next;
              }
              System.out.println();
       }
       void display(){
              Node temp=head;
              if(head==null){
                     System.out.println("Linked list is empty");
              }
              while (temp!=null) {
                     System.out.print(temp.data+" >  ");
                     temp=temp.next;
              }
              System.out.println("Null ");
       }
       public static void main(String[] args) {
              MiddleNode obj=new MiddleNode();
              obj.addFront(5);
              obj.addFront(6);
              obj.addFront(7);
              obj.addFront(8);
              obj.addFront(9);
              obj.addFront(4);


              obj.display();
              //Print All Nodes After Middle
              obj.Middle();
              obj.RemoveMiddle();
              obj.display();
              
       }
}