class  Node {
       int data;
       Node next;
       Node (int data){
            this.data=data;
            this.next=null;      
       }     
}
public class Task5{
Node head;
       int size=0;
       void addFront(int data){
              size++;
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     return;
              }
              newNode.next=head;
              head=newNode;
       }
       void addToBack(int data){
              Node newNode=new Node(data);
              size++;
              Node temp=head;
              if(head==null){
                     head=newNode;
                     return;
              }
              else{
                     while (temp.next!=null) {
                            temp=temp.next;
                     }
                     temp.next=newNode;
              }
       }
       int FindMiddleNode(){
              if(head==null){
                     System.out.println("Linked list is empty");
              }
              Node fast=head;
              Node slow=head;
              while (fast!=null &&fast.next!=null ) {
                     slow=slow.next;
                     fast=fast.next.next;
              }
              System.out.println("The Middle Nodes Found  "+slow.data);
              return slow.data;
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
              Task5 LinkedList=new Task5();
              LinkedList.addFront(4);
              LinkedList.addFront(5);
              LinkedList.addFront(6);
              LinkedList.addFront(7);
              LinkedList.addFront(8);
              LinkedList.addFront(9);
              LinkedList.display();
              System.out.println("Return Midddle Node   :"+LinkedList.FindMiddleNode());
       }
}