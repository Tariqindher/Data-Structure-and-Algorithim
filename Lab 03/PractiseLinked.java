class  Node {
       int data;
       Node next;
       Node (int data){
            this.data=data;
            this.next=null;      
       }     
}
public class PractiseLinked{
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
       public int getIndex(int index){
              Node current=head;
              for(int i=0; i<index;i++){
                     current=current.next;
              }
              return current.data;
       }
       public void insertAt(int index, int data){
              Node newNode =new Node(data);
              if(index<0 && index>=size){
                     System.out.println("Invalid Index");
              }
              if(index==0){
                     head=newNode;
              }
              Node temp=head;
              for (int i=0; i<index; i++){
                     temp=temp.next;
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
              PractiseLinked SL=new PractiseLinked();
              SL.addFront(5);
              SL.addFront(6);
              SL.addFront(7);
              SL.addFront(8);
              SL.addFront(9);
              SL.addFront(10);
              System.out.println(SL.getIndex(2));
              SL.display();

       }
}