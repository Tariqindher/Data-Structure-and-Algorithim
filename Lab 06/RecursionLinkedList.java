class Node{
       Node next; 
       int data;
       Node(int data){
              this.data=data;
              next=null;
       }
}
class LinkedList{
       Node head;
       public void addtoFront(int data){
              Node newNode=new Node(data);
              
              if(head==null){
                     head=newNode;
                     return;
              }
              newNode.next=head;
              head=newNode;
       }
       public void RecusrionPrint(Node temp){
              if(temp==null){
                     return;
              }
              
              System.out.println(temp.data);
              RecusrionPrint(temp.next);
              
       }
}
public class RecursionLinkedList{
       public static void main(String[] args) {
              LinkedList ll=new LinkedList();
              ll.addtoFront(4);
              ll.addtoFront(5);
              ll.addtoFront(6);
              ll.addtoFront(7);
             
              ll.RecusrionPrint(ll.head);
       }
}