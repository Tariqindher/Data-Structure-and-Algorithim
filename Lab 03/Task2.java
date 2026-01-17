class  Node {
       int data;
       Node next;
       Node (int data){
            this.data=data;
            this.next=null;      
       }     
}
/* here is Task 2 When we add in this Tail then  the effect only / AddtoBack() method not RemoveBack*/
public class Task2{
       Node head;
       Node tail;
       void addToBack(int data){
              Node newNode=new Node(data);
              if(head==null){
                     head=newNode;
                     tail=newNode;
                     return;
              }
              else{
                     tail.next=newNode;
                     tail=newNode;
              }
       }
       void removeBackItem(){
              
              Node temp=head;
              if(head==null){
                     System.out.println("Linked list is empty");
                     return;
              }
              if(head==tail){
                     head=null;
                     tail=null;
                     return;
              }
              while (temp.next!=tail) {
                     temp=temp.next;
              }
              temp.next=null;
              tail=temp;
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
           Task2 LL=new Task2();
           LL.addToBack(3);
           LL.addToBack(4);
           LL.addToBack(5);
           LL.addToBack(6);
           LL.addToBack(7);
           LL.removeBackItem();
           LL.display();  
       }
}