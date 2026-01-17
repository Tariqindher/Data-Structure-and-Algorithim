import java.util.LinkedList;

class Node{
       Node next;
       int value;
       public Node(int value){
              this.value=value;
              this.next=null;
       }     
}
public class Task6{
       Node head;
       
       void addFront(int data){
              
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     return;
              }
              newNode.next=head;
              head=newNode;
       }
       void display(){
              Node temp=head;
              if(head==null){
                     System.out.println("Linked list is empty");
       
              }
              while (temp!=null) {
                     System.out.print(temp.value+" >  ");
                     temp=temp.next;
              }
              System.out.println("Null ");
       }
       void ReverseIterate(){
              if(head==null|| head.next==null){
                     return;
              }
              Node prev=head;
              Node current=head.next;
              while (current!=null) {
                     Node Nodenext=current.next;
                     current.next=prev;

                     //update
                     prev=current;
                     current=Nodenext;
                     
              }
              head.next=null;
              head=prev;
       }
       public Node ReverseRecurs(Node )
       public static void main(String[] args) {
              Task6 LinkedList=new Task6();
              LinkedList.addFront(22);
              LinkedList.addFront(33);
              LinkedList.addFront(44);
              LinkedList.addFront(55);
              LinkedList.display();
              LinkedList.ReverseIterate();
              LinkedList.display();
              
       }
}