class Node{
       Node next,prev; 
       int data;
       Node(int data){
              this.data=data;
              prev=next=null;
       }
}
class LinkedList{
       Node head;
       Node tail;
       public void addtoFront(int data){
              Node newNode=new Node(data);
              
              if(head==null){
                     head=newNode;
                     tail=newNode;
                     return;
              }
              newNode.next=head;
              head.prev=newNode;
              head=newNode;
       }
       public void RecusrionPrint(Node temp){
              if(temp==null){
                     System.out.print("null");
                     return;
              }
              
              System.out.print(temp.data+" > ");
              RecusrionPrint(temp.next);
              
       }
       public void RecusrionPrintTail(Node temp){
              if(temp==null){
                     System.out.println("null");
                     return;
              }
              
              System.out.print(temp.data+" > ");
              RecusrionPrintTail(temp.prev);
              
       }
}
public class RecursionLinkedList2{
       public static void main(String[] args) {
              LinkedList ll=new LinkedList();
              ll.addtoFront(4);
              ll.addtoFront(5);
              ll.addtoFront(6);
              ll.addtoFront(7);
             
              ll.RecusrionPrint(ll.head);
              System.out.println("Forward Traversal:");
              System.out.println();
              System.out.println("Backward Traversal:");
              ll.RecusrionPrintTail(ll.tail);
       }
}