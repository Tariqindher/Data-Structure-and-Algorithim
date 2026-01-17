import java.util.*;

class Node{
       Node next;
       int data;
       Node(int data){
              this.data=data;
              next=null;
       }
}       
public class CheckCycle{
 Node head;
 void addToFront(int key){
              Node newNode=new Node(key);
       if(head==null){
              head=newNode;
              return;
       }
      newNode.next=head;
      head=newNode;
}
void CreateCycle(int position){
       if(head==null || position<0){
              return;
       }
       Node current=head;
       Node cycleNode=null;
       int index=0;
       while (current.next!=null) {
              if(index==position){
                     cycleNode=current;
              }
              current=current.next;
              index++;
       }
       if(cycleNode!=null){
              current.next=cycleNode;
       }
}
boolean hasCycle(){
       Node fast=head;
       Node slow=head;
       while (fast!=null && fast.next!=null) {
              fast=fast.next.next;
              slow=slow.next;
              if(slow==fast){
                     return true;
              }

       }
       return false;
}
 void display(){
       if(head==null){
              System.out.println("Linked List is Empty");
              return;
       }
       Node temp=head;
       while (temp!=null) {
              System.out.print(temp.data+"  > ");
              temp=temp.next;
       }
       System.out.println("null");
}
public static void main(String[] args) {
      CheckCycle list=new CheckCycle();
      list.addToFront(5);
      list.addToFront(6);
      list.addToFront(7);
      list.addToFront(8);
      list.addToFront(9);
      list.addToFront(10);
      list.addToFront(11);
      list.addToFront(12);

      list.display();
      System.out.println("Linked list has cycle or Not ? "+list.hasCycle());

      System.out.println("aftr Creating cycle"); 

      list.CreateCycle(5);
      System.out.println("Linked list has cycle or Not ? "+list.hasCycle());

      




}
       
}