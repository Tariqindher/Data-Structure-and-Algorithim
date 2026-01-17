class  Node {
       int data;
       Node next;
       Node (int data){
            this.data=data;
            this.next=null;      
       }     
}
public class Task4{
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
       boolean hasCycle(){
              if(head==null|| head.next==null){
                     return false;
              }
              Node fast=head;
              Node slow=head;
              while (fast!=null && fast.next!=null ) {
                     slow=slow.next;
                     fast=fast.next.next;

                     // If they meet, there's a cycle
                     if (slow == fast) {
                     return true;
                     }
              }
              return false;
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
          Task4 CL=new Task4();
          CL.addToBack(45);
          CL.addToBack(6);
          CL.addToFront(76);
          CL.addToFront(46);
          CL.addToFront(56);   
          CL.display();
          System.out.println("Does the list have a cycle? " + CL.hasCycle());
          //CL.removeFront();
          
          //CL.display();
          Task4 CL2=new Task4();
          Node a=new Node(1);
          Node b=new Node(2); 
          Node c=new Node(3);
          Node d=new Node(4);
          a.next=b;
          b.next=c;
          c.next=d;
          d.next=null;
          CL2.head=a;
          System.out.println("Does the list have a cycle? " + CL2.hasCycle());
           

       }
}