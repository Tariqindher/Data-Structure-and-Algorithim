class Node{
       Node next;
       Node prev;
       int data;
       public Node (int data){
              this.data=data;
              this.next=null;
              this.prev=null;
       }
}
public class Task2{
       Node head;
       Node tail;
       int size=0;
       void addToBack(int data){
              size++;
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     tail=newNode;
                     return;
              }
              tail.next=newNode;
              newNode.prev=tail;
              tail=newNode;
       }
       void removeBackItem(){
              size--;
              if(head==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              tail=tail.prev;
              tail.next=null;
       }
       void PrintLnReverseOrder(){
              if(tail==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              Node temp=tail;
              while (temp!=null) {
                     System.out.print(temp.data+" >  ");
                     temp=temp.prev;
                     
              } System.out.println("null");       
       }
       void display(){
              Node temp=head;
              if(head==null){
               System.out.println("Linked list is empty");
              }
              while (temp!=null) {
               System.out.print(temp.data+"  > ");
               temp=temp.next;
              }
              System.out.println("null");
        } 
       public static void main(String[] args) {
              Task2 DL=new Task2();
              DL.addToBack(5);
              DL.addToBack(6);
              DL.addToBack(7);
              DL.display();
              DL.PrintLnReverseOrder();

              
       }
}