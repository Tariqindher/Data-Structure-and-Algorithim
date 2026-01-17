public class QueueDemo{
       int size=6;
       int queue[]=new int[size];
       int front=-1;
       int rear=-1;
       public boolean isempty(){
              return front==-1;
       }
       public boolean isfull() {
              return (rear + 1) % size == front;
          }
       public void enqueue(int data){
            if(isfull()){
              System.err.println("Queue is full You can't add more elements");
              return;
            }
            else{
              if(front==-1){
                     front=0;
              }
              rear++;
              queue[rear]=data;
              System.out.println("Inserted elements  " + data);
            }    
       }
       public int dequeue(){
              int element;
              if(isempty()){
                System.err.println("Queue is  You can't add more elements");
                return-1;
              }
              else{
                     element=queue[front];
                     if(front>=rear){
                            front=-1;
                            rear=-1;
                     }
                     else{
                            front++;
                     }
                System.out.println("elements Deleted " + element);
                return element;
              }    
       }
       public void display(){
              if(isempty()){
                     System.out.println("Queue is empty");
                     return;
              }
              System.out.println("Front at index : "+front);
              for(int i=front; i<=rear; i++){
                     System.out.print(queue[i]+" ");
              }
              System.out.println();
              System.out.println("Rear at index : "+rear);
              
       }
       public static void main(String[] args) {
              QueueDemo Que=new QueueDemo();
              Que.enqueue(5);
              Que.enqueue(6);
              Que.enqueue(7);
              Que.enqueue(8);
              Que.enqueue(9);
              Que.enqueue(10);
              System.out.println(Que.isfull());
              Que.isempty();
              System.out.println(Que.dequeue());
              System.out.println(Que.isfull());
              Que.display();
       }
}