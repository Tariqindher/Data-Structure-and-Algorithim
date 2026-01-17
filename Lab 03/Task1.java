class  Node {
       int data;
       Node next;
       Node (int data){
            this.data=data;
            this.next=null;      
       }     
}
public class Task1{
       Node head;
       int size=0;
       void addFront(int data){
              size++;
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     return;
              }
              newNode.next=head;
              head=newNode;
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
              Node newNode=new Node(data);
              size++;
              Node temp=head;
              if(head==null){
                     head=newNode;
                     return;
              }
              else{
                     while (temp.next!=null) {
                            temp=temp.next;
                     }
                     temp.next=newNode;
              }
       }
       int getBackItem(){
              if(head==null){
                     System.out.println("Linked list is empty");
                     
              }
              Node temp=head;
              while (temp.next!=null) {
                     temp=temp.next;
              }
              return temp.data;
       }
       void removeBackItem(){
              size--;
              Node temp=head;
              if(head==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              while (temp.next.next!=null) {
                     temp=temp.next;
              }
              temp.next=null;
       }
       boolean find(int data){
             
              Node temp=head;
              while (temp!=null) {
                     if(temp.data==data){
                            return true;
                     }
                     temp=temp.next;
              }
              return false;
       }
       
       // void Remove(int key){
       //        size--;
       //        if(head==null){
       //               System.out.println("The Linked List is Empty ");
       //               return;
       //        }
       //        if(head.data==key){
       //               head=head.next;
       //               System.out.println(key+"  is removed from Linked List");
       //               return;
       //        }
       //        Node temp=head;
       //        Node prev=null;
       //        while (temp!=null) {
       //               if(temp.data==key){
       //                      prev.next=temp.next;
       //                      System.out.println(key+"  is removed from Linked List");
       //                      return;
       //               }
       //               prev=temp;
       //               temp=temp.next;
       //        }
       //        System.out.println(key+"  is not present in Linked List");

       // } 
       void Remove(int key){
              if(head==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              if(head.data==key){
                     System.out.println(key+" is removed from linked list");
                     head=head.next;
                     return;
              }
              Node temp=head;
              Node prev=null;
              while(temp!=null){
                     if(temp.data==key){
                            prev.next=temp.next;
                            System.out.println(key+" is removed from linked list");
                            return;
                     }
                     prev=temp;
                     temp=temp.next;
                     
              } System.out.println(key+"  is not present in Linked List");
       }
       void isListEmpty(){
              if(size==0){
                     System.out.println("The List is empty");
              }
              else{
                     System.out.println("The list has Size   : "+size);
              }
       }
       void addKeyBeforeNode(int key, int data){
              Node newNode=new Node(data);
              if(head==null){
                     System.out.println("Key is not prsent, List is empty  Now add ");
                     head=newNode;
                     return;
              }
              if(head.data==key){
                     newNode.next=head;
                     head=newNode;
                     return;
              }
              else {
              Node temp = head;
              while (temp.next != null) {
              if (temp.next.data == key) {
                     newNode.next = temp.next;
                     temp.next = newNode;
                     return;
              }
              temp = temp.next;
              }
              System.out.println("Key is not present.");
              }     
       }
       void addNodeAfterKey(int key, int data){
              Node newNode=new Node(data);
              if(head==null){
                     System.out.println("Linked list is empty there is no key here");
                     head=newNode;
                     return;
              }
              if(head.data==key){
                     newNode.next=head.next;
                     head.next=newNode;
                     return;
              }
              Node temp=head;
              while (temp!=null&& temp.next!=null) {
                     if(temp.next.data==key){
                            newNode.next=temp.next.next;
                     
                            temp.next.next=newNode;
                            return;
                     }
                     temp=temp.next;
              }
              System.out.println("Key " + key + " not found in the list.");
              
       }
       public int largest(){
              if(head==null){
                     System.out.println("Linked list is empty ");
                     return-1;
              }
              Node temp=head;
              int maximum=head.data;
              while (temp!=null) {
                     if(temp.data>maximum){
                            maximum=temp.data;
                     }
                     temp=temp.next;
              }
              return maximum; 
       }
       public int smallest(){
              if(head==null){
                     System.out.println("Linked list is empty ");
                     return-1;
              }
              Node temp=head;
              int minimum=head.data;
              while (temp!=null) {
                     if(temp.data<minimum){
                            minimum=temp.data;
                     }
                     temp=temp.next;
              }
              return minimum; 
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

//       static void print(Node head){
//        Node c= head;

//        if(c.next ==null){
//               return;
//        }
//               print(c.next);
//               System.out.print(c.data+" ");
//        }
       public static void main(String[] args) {
              Task1 LinkedList=new Task1();
              LinkedList.addFront(22);
              LinkedList.addFront(33);
              LinkedList.addFront(44);
              LinkedList.addFront(55);
              LinkedList.addToBack(111);
              LinkedList.display(); 
              
              
              LinkedList.addNodeAfterKey(55, 45);
              LinkedList.display();
              //print(LinkedList.head);

              // System.out.println("The Get Front Item :    "+LinkedList.getFrontItem());
              // LinkedList.removeFrontItem();
              
              // System.out.println("The GetBackItem   "+ LinkedList.getBackItem());
              // LinkedList.removeBackItem();
              // LinkedList.display();
              // System.out.println(LinkedList.find(33));
              LinkedList.Remove(22);
              // LinkedList.display();
              // LinkedList.isListEmpty();
              // LinkedList.addKeyBeforeNode(44, 199);

              // LinkedList.addNodeAfterKey(44, 45);
              // LinkedList.display();
             
              System.out.println("The largest value in Linked list  :"+LinkedList.largest());

              System.out.println("The smallest value in Linked list  :"+LinkedList.smallest());
              

       }
}