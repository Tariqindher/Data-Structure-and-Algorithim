class Node{
       Node next;
       int data;
       Node(int data){
              this.data=data;
              next=null;
       }
}
public class QueueLinked{
       
       Node front;
       Node rear;
       int size;
       boolean isEmpty(){
              return front==null;
       }
       int getSize(){
              return size;
       }
       int getFront(){
              return front.data;
       }
       void enqueue(int data){
           Node newNode =new Node(data);
           size++;
           if(rear==null){
              front=rear=newNode;
              return;
           }

           rear.next=newNode;
           rear=newNode;   
       }
       int dequeue(){
              size--;
              if(isEmpty()){
                     System.out.println("Queue is empty");
                     return -1;
              }
              int temp=front.data;
              front=front.next;
              return temp;
       }
       void printAll(){
              if(isEmpty()){
                     System.out.println("Queue is empty");
                     return;
              }
              Node temp=front;
            while (temp!=null) {
              System.out.print(temp.data+" ");
                     temp=temp.next;
            }

       }
       public static void main(String[] args) {
       QueueLinked queue=new QueueLinked();
              queue.enqueue(5);
              queue.enqueue(6);
              queue.enqueue(7);
              queue.enqueue(8);
              queue.enqueue(9);
              System.out.println("The value dequed from queue  "+queue.dequeue());
              System.out.println("The value dequed from queue  "+queue.dequeue());
              System.out.println("The size of the queue is :"+queue.getSize());
              System.out.println("The Front of Queue is "+queue.getFront());
              System.out.println(queue.isEmpty());
              System.out.println(queue.getFront());
              System.out.println();
              queue.printAll();


       }
}