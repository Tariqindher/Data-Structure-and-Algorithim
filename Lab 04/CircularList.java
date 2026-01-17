class Node {
       Node next;
       int data;
       Node (int data){
              this.data=data;
              this.next=null;
       }
}
public class CircularList{
       Node head;
       public void addToBack(int data){
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     newNode.next=head;//circular linked list
                     return;
              }
              Node temp=head;
              while (temp.next!=head) {
                     temp=temp.next;
              }
              temp.next=newNode;
              newNode.next=head;
       }
       public void addToFront(int data){
              Node newNode=new Node(data);
              if(head==null){
                     newNode.next=head;
                     head=newNode;
                     return;
              }
              Node temp=head;
              while (temp.next!=head) {
                     temp=temp.next;
              }
              temp.next=newNode;
              newNode.next=head;
              head=newNode;
       }
       public void display(){
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
              CircularList CL=new CircularList();
              CL.addToBack(45);
              CL.addToBack(46);
              CL.addToBack(47);
              CL.addToFront(48);
              CL.display();

              
       }
}