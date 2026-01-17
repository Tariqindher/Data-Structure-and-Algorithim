
class  Node {
      int data;
      Node next;
      Node (int data){
           this.data=data;
           this.next=null;      
      }     
}
public class AscendingOrder{
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
                     System.out.print(temp.data+"  > ");
                     temp=temp.next;
              }
              System.out.println("Null" );
       }
       boolean hasCycle(){
              Node fast=head;
              Node slow=head;
              while (fast!=null && fast.next!=null) {
                     slow=slow.next;
                     fast=fast.next;
                     if(fast==slow){
                            return true;
                     }
              }
              return false;
       }
       void AOL(){
           boolean swaped;
           do{
               Node temp=head;
                swaped=false;
                   while(temp.next!=null){
                       if(temp.data>temp.next.data){
                           int tempdata=temp.data;
                           temp.data=temp.next.data;
                           temp.next.data=tempdata;
                           swaped=true;
                       }
                       temp=temp.next;
               
               }
           }while(swaped);
          
       }
   public static void main(String[] args) {
   AscendingOrder He=new AscendingOrder();
      He.addFront(5);
      He.addFront(6);
      He.addFront(7);
      He.addFront(8);
      He.addFront(9);
      He.addFront(10);
     He.display();
     He.AOL();
     He.display();
     boolean hasCycle = He.hasCycle();
       System.out.println("Linked List has a cycle: " + hasCycle);
      
   }
}