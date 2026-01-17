class Node {
       int data;
       Node next;
   
       Node(int data) {
           this.data = data;
           this.next = null;
        }
}
public class Removeduplicate{
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
       public void removeDuplicateM() {
              if (head == null) {
                  System.out.println("Linked list is empty");
                  return;
              }
              
              Node current = head;
              
              while (current != null) {
                  Node runner = current;  // Start from the current node
                  
                  while (runner.next != null) {
                      if (runner.next.data == current.data) {
                          // If duplicate found, skip the duplicate node
                          runner.next = runner.next.next;
                      } else {
                          // Move runner to next node if no duplicate
                          runner = runner.next;
                      }
                  }
                  
                  current = current.next;  // Move to the next node
              }
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
             Removeduplicate SL=new Removeduplicate();
             SL.addFront(5);
             SL.addFront(4);
             
             SL.addFront(5); 
             SL.addFront(6);
             SL.addFront(7);
             
             SL.addFront(9); 
             SL.display();  
             SL.removeDuplicateM();
             SL.display();
       }
}