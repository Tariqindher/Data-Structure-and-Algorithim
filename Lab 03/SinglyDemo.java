       class Node {
       Node next;
       int data;
       Node (int data){
              this.data=data;
              next=null;
       }
       }
       public class SinglyDemo{
       Node head;
       public void addtoFront(int data){
              Node newNode=new Node(data);
              if(head==null){
                    newNode.next=head;
                    head=newNode;
                    return; 
              }
              newNode.next=head;
              head=newNode;
       }
       public void display(){
              Node temp=head;
              if(head==null){
                     System.out.println("Linked list is empty ");
                     return;
              }
              while (temp!=null) {
                     System.out.print(temp.data+" > ");
                     temp=temp.next;
              }
              System.out.print(" null");
              System.out.println();
       }
       public int largest(){
              if(head==null){
                     System.out.println("Linked list is empty ");
                     return-1;
              }
              Node temp=head;
              int maximum=head.data;
              while (temp!=null) {
                     if(temp.data>maximum){
                            maximum=temp.data;
                     }
                     temp=temp.next;
              }
              return maximum; 
       }
       public int smallest(){
              if(head==null){
                     System.out.println("Linked list is empty ");
                     return-1;
              }
              Node temp=head;
              int minimum=head.data;
              while (temp!=null) {
                     if(temp.data<minimum){
                            minimum=temp.data;
                     }
                     temp=temp.next;
              }
              return minimum; 
       }
       public void OddEven(){
              Node temp=head;
              while (temp!=null) {
                     if(temp.data%2!=0){
                            System.out.print(temp.data+" > ");
                     }
                     temp=temp.next;
              }
              Node temp1=head;
              while (temp1!=null) {
                     if(temp1.data%2==0){
                            System.out.print(temp1.data+" > ");
                     }
                     temp1=temp1.next;
              }
              System.out.println("null");
       }
       public Node deleteMiddleNode(Node head){
              Node fast=head;
              Node slow=head;
              Node prev=null;
              while (fast!=null && fast.next!=null) {
                     fast=fast.next.next;
                     prev=slow;
                     slow=slow.next;
              }
              prev.next=slow.next;
              return head;
       }
       public static void main(String[] args) {
              SinglyDemo list=new SinglyDemo();
              list.addtoFront(5);
              list.addtoFront(6);
              list.addtoFront(2);
              list.addtoFront(43);
              list.addtoFront(15);
              list.addtoFront(14);
              list.addtoFront(7);
             
              list.display();
              System.out.println("The largest value in Linked list  :"+list.largest());

              System.out.println("The smallest value in Linked list  :"+list.smallest());
              list.OddEven();
              list.deleteMiddleNode(list.head);
              list.display();
              
       }
}