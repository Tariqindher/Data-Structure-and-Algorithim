class  Node {
       int data;
       Node next;
       Node (int data){
            this.data=data;
            this.next=null;      
       }     
}
public class Task3{
       Node head;
       int size=0;
       void addToFront(int data){
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     newNode.next=head;//Circular link
                     return;
              }
              Node temp=head;
              while (temp.next!=head) {
                     temp=temp.next;
              }
              temp.next=newNode;
              newNode.next=head;//newNode.next=head;//Circular Link
              head=newNode;             
       }
       void addToBack(int data){
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     newNode.next=head;//Circular link
                     return;
              }
              Node temp=head;
              while (temp.next!=head) {
                     temp=temp.next;
              }
              temp.next=newNode;
              newNode.next=head;
       }
       void removeFront(){
              if(head==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              head=head.next;
       }
       void removeBack() {
              if (head == null) {
                  System.out.println("Linked list is empty");
                  return;
              }
              if (head.next == head) { // Only one node
                  head = null;
                  return;
              }
              Node temp = head;
              while (temp.next.next != head) {
                  temp = temp.next;
              }
              temp.next = head; // Second last node points to head
       }
       void display(){
              if(head==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              Node temp=head;
              do {
                     System.out.print(temp.data + " > ");
                     temp = temp.next;
                 } while (temp != head);
                 System.out.println();
       }
       public static void main(String[] args) {
          Task3 CL=new Task3();
          CL.addToBack(45);
          CL.addToBack(6);
          CL.addToFront(76);
          CL.addToFront(46);
          CL.addToFront(56);   
          CL.display();
          CL.removeFront();
          CL.removeBack();
          CL.display();  
       }
}