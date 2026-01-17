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
public class Task1{
       Node head;
       Node tail;
       int size=0;
       void addToFront(int data){
              size++;
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     tail=newNode;
              }
              else{
                     newNode.next=head;
                    head.prev=newNode;
                    head=newNode;

              }      
       }
       int getFrontItem(){
              
              if(head==null){
                    System.out.println("Linked list is empty");
              }
              return head.data;
                  
       }
       void removeFrontItem(){
              size--;
              if(head==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              head=head.next;
       }
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
       int getBackItem(){
              
              if(head==null){
                    System.out.println("Linked list is empty");
              }
              return tail.data;
                  
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
       void find(int key){
              Node temp=head;
              if(head==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              while (temp!=null) {
                     if(temp.data==key){
                            System.out.println(key+"  is Presenet  in list");
                            return;
                     }
                     temp=temp.next;
              }
              System.out.println(key+"  is not Presenet  in list");
       }
       void Remove(int key){
              size--;
              Node currnt=head;
              while(currnt!=null){
                     if(currnt.data==key){
                            if(currnt.prev!=null){
                                   currnt.prev.next=currnt.next;
                            }
                            else{
                                   head=currnt.next;
                            }
                            if(currnt.next!=null){
                                   currnt.next.prev=currnt.prev;
                            }
                            else{
                                   tail=currnt.prev;
                            }
                            return;
                     }
                     currnt=currnt.next;        
              }
       }
       void addKeyBeforeNode(int key, int data){
              size++;
             // Method to add a new node with the given data before the node containing the key
              Node newNode = new Node(data);
   
       // If the list is empty, return
              if (head == null) {
              System.out.println("Doubly linked list is empty");
             return;
       }
   
       // If the key is at the head (first node)
       if (head.data == key) {
           newNode.next = head; // Point new node to current head
           head.prev = newNode; // Set the previous of head to new node
           head = newNode; // Update head to new node
           return;
       }
   
       // Traverse the list to find the node containing the key
       Node current = head;
       while (current != null && current.data != key) {
           current = current.next; // Move to the next node
       }
   
       // If the key was found
       if (current != null) {
           newNode.next = current; // Point new node to the current node
           newNode.prev = current.prev; // Set the previous of new node
   
           // Link the previous node to the new node
           if (current.prev != null) {
               current.prev.next = newNode; // Set next of previous node
           }
           current.prev = newNode; // Set new node as previous of current
       } else {
           System.out.println("Key not found in the doubly linked list");
       }
   
   
       }
       void isListEmpty(){
              if(head==null){
                     System.out.println("List is empty ");
                     return;
              }
              System.out.println("The list has size is = "+size);

       }
       void addKeyAfterNode(int key, int data) {
              size++;
              Node newNode = new Node(data);
      
              
              if (head == null) {
                  System.out.println("Linked list is empty");
                  return;
              }
      
              Node temp = head;
              // Traverse the list to find the node with the given key
              while (temp != null) {
                  if (temp.data == key) { // Found the node with the key
                      newNode.next = temp.next; // Link the new node to the next node
                      temp.next = newNode; // Link the current node to the new node
                      return; // Exit the method after insertion
                  }
                  temp = temp.next; // Move to the next node
              }
      
              // If we reach here, the key was not found
              System.out.println("Node with key " + key + " not found.");
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
              Task1 DL=new Task1();
              DL.addToFront(5);
              DL.addToFront(6);
              DL.addToFront(7);
              DL.display();
              DL.addToBack(44);
              System.out.println(DL.getFrontItem());
              System.out.println("The first Item has Removed  ");
              DL.removeFrontItem();
              
              DL.display();
              System.out.println(DL.getBackItem());
              DL.removeBackItem();
              DL.display();
              DL.find(15);
              //DL.Remove(5);
              DL.addKeyAfterNode(5,45);
              DL.addKeyBeforeNode(5,35);
              DL.display();
              DL.isListEmpty();

       }
}